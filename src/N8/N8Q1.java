package N8;

public class N8Q1 {
    public static void main(String[] args) {
        int[] preorder = new int[]{6, 2, 1, 4, 3, 5, 8, 7, 9};
        int[] inorder = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Node root = buildtree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
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
}
