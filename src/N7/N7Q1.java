package N7;

public class N7Q1 {
    public static void main(String[] args) {
        int[] preorder = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] inorder = new int[]{4, 7, 2, 1, 5, 3, 8, 6};
        Node root = function(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
        Preorder(root);
    }

    public static void Preorder(Node root) {
        if (root != null) {
            System.out.print(root.getValue() + " ");
            Preorder(root.getLeft());
            Preorder(root.getRight());
        }
    }

    public static Node function(int[] preorder, int[] inorder, int prestart, int preend, int instart, int inend) {
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
            node.setLeft(function(preorder, inorder, prestart + 1, prestart + leftlength, instart, root - 1));
        }
        if (rightlength > 0) {
            node.setRight(function(preorder, inorder, prestart + leftlength + 1, preend, root + 1, inend));
        }
        return node;
    }
}

//这道题比较有难度，值得反复思考，并且比较重要