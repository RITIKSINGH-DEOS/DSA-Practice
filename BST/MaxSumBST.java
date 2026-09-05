public class MaxSumBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Info {

        boolean isBST;
        int min;
        int max;
        int sum;

        Info(boolean isBST, int min, int max, int sum) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }

    static int maxSum = 0;

    public static Info findMaxSumBST(Node root) {

        // Empty tree
        if (root == null) {
            return new Info(
                true,
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
                0
            );
        }

        // Left subtree
        Info left = findMaxSumBST(root.left);

        // Right subtree
        Info right = findMaxSumBST(root.right);

        // Check BST condition
        if (left.isBST &&
            right.isBST &&
            root.data > left.max &&
            root.data < right.min) {

            // Current subtree is BST

            int sum = left.sum + right.sum + root.data;

            int min = Math.min(root.data, left.min);
            int max = Math.max(root.data, right.max);

            maxSum = Math.max(maxSum, sum);

            return new Info(
                true,
                min,
                max,
                sum
            );
        }

        // Current subtree is NOT BST
        return new Info(
            false,
            Integer.MIN_VALUE,
            Integer.MAX_VALUE,
            0
        );
    }

    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(9);
        root.right = new Node(2);

        root.left.left = new Node(6);
        root.left.right = new Node(3);

        root.left.left.left = new Node(8);
        root.left.left.right = new Node(7);

        findMaxSumBST(root);

        System.out.println(maxSum);
    }
}