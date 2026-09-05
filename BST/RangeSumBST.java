public class RangeSumBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int rangeSum(Node root, int L, int R) {

        if (root == null) {
            return 0;
        }

        // Root chhota hai L se
        if (root.data < L) {
            return rangeSum(root.right, L, R);
        }

        // Root bada hai R se
        if (root.data > R) {
            return rangeSum(root.left, L, R);
        }

        // Root range ke andar hai
        return root.data
                + rangeSum(root.left, L, R)
                + rangeSum(root.right, L, R);
    }

    public static void main(String[] args) {

        Node root = new Node(8);

        root.left = new Node(5);
        root.right = new Node(11);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(20);

        int L = 5;
        int R = 10;

        System.out.println(rangeSum(root, L, R));
    }
}