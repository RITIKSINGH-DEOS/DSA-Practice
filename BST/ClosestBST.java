public class ClosestBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int closestValue(Node root, int K) {

        int closest = root.data;

        while (root != null) {

            // Current node ka difference
            int currentDiff = Math.abs(root.data - K);

            // Closest update karo
            if (currentDiff < Math.abs(closest - K)) {
                closest = root.data;
            }

            // Exact match
            if (root.data == K) {
                return root.data;
            }

            // BST property use karo
            if (K < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return closest;
    }

    public static void main(String[] args) {

        Node root = new Node(8);

        root.left = new Node(5);
        root.right = new Node(11);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(20);

        int K = 19;

        System.out.println(closestValue(root, K));
    }
}