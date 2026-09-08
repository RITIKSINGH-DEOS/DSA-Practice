public class DeleteLeafNodes {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node deleteLeafNodes(Node root, int x) {

        if (root == null) {
            return null;
        }

        root.left = deleteLeafNodes(root.left, x);
        root.right = deleteLeafNodes(root.right, x);

        if (root.data == x && root.left == null && root.right == null) {
            return null;
        }

        return root;
    }

    public static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(3);
        root.right = new Node(3);

        root.left.left = new Node(3);
        root.left.right = new Node(2);

        int x = 3;

        root = deleteLeafNodes(root, x);

        preorder(root);
    }
}