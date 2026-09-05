public class KthSmallestBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int count = 0;
    static int answer = -1;

    public static void kthSmallest(Node root, int K) {

        if (root == null) {
            return;
        }

        // Left
        kthSmallest(root.left, K);

        // Root
        count++;

        if (count == K) {
            answer = root.data;
            return;
        }

        // Right
        kthSmallest(root.right, K);
    }

    public static void main(String[] args) {

        Node root = new Node(8);

        root.left = new Node(5);
        root.right = new Node(11);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(20);

        int K = 3;

        kthSmallest(root, K);

        System.out.println(answer);
    }
}