package N8;

public class N8Q1 {
    public static void main(String[] args) {
        int[] preorder = new int[]{6, 2, 1, 4, 3, 5, 8, 7, 9};
        int[] inorder = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Node root = buildtree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
        buildparent(root);
        System.out.println(function(root.getLeft()).getValue());
        System.out.println(function(root.getLeft().getLeft()).getValue());
        System.out.println(function(root.getLeft().getRight().getRight()).getValue());
        System.out.println(function(root.getRight().getRight()).getValue());
    }

    public static Node buildtree(int[] preorder, int[] inorder, int prestart, int preend, int instart, int inend) {
        Node node = new Node();
        node.setValue(preorder[prestart]);
        if (prestart == preend) {
            return node;
        }
        int root;
        for (root = instart; root < inend; root++) {
            if (preorder[prestart] == inorder[root]) {
                break;
            }
        }
        int leftlength = root - instart;
        int rightlength = inend - root;
        if (leftlength > 0) {
            node.setLeft(buildtree(preorder, inorder, prestart + 1, prestart + leftlength, instart, root - 1));
        }
        if (rightlength > 0) {
            node.setRight(buildtree(preorder, inorder, prestart + leftlength + 1, preend, root + 1, inend));
        }
        return node;
    }

    public static void buildparent(Node node) {
        if (node.getLeft() != null) {
            node.getLeft().setParent(node);
            buildparent(node.getLeft());
        }
        if (node.getRight() != null) {
            node.getRight().setParent(node);
            buildparent(node.getRight());
        }
    }

    public static Node function(Node node) {
        if (node.getRight() != null) {
            node = node.getRight();
            while (node.getLeft() != null) {
                node = node.getLeft();
            }
            return node;
        } else {
            if (node.getParent().getLeft() == node) {
                return node.getParent();
            } else if (node.getParent().getRight() == node) {
                while (node.getParent().getLeft() != node) {
                    node = node.getParent();
                    if (node.getParent() == null) {
                        break;
                    }
                }
                if (node.getParent() != null) {
                    return node.getParent();
                }
            }
        }
        Node nodenull = new Node();
        nodenull.setValue(0);
        return nodenull;
    }
}
