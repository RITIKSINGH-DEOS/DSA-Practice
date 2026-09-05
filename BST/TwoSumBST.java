import java.util.HashSet;

public class TwoSumBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static HashSet<Integer> set = new HashSet<>();

    // First BST ke elements Set mein store karo
    public static void store(Node root) {

        if (root == null) {
            return;
        }

        set.add(root.data);

        store(root.left);
        store(root.right);
    }

    // Second BST se pair find karo
    public static void findPairs(Node root, int x) {

        if (root == null) {
            return;
        }

        int required = x - root.data;

        if (set.contains(required)) {
            System.out.println(
                "(" + required + ", " + root.data + ")"
            );
        }

        findPairs(root.left, x);
        findPairs(root.right, x);
    }

    public static void main(String[] args) {

        // First BST
        Node root1 = new Node(5);

        root1.left = new Node(3);
        root1.right = new Node(7);

        root1.left.left = new Node(2);
        root1.left.right = new Node(4);

        root1.right.left = new Node(6);
        root1.right.right = new Node(8);

        // Second BST
        Node root2 = new Node(10);

        root2.left = new Node(6);
        root2.right = new Node(15);

        root2.left.left = new Node(3);
        root2.left.right = new Node(8);

        root2.right.left = new Node(11);
        root2.right.right = new Node(18);

        int x = 16;

        store(root1);

        findPairs(root2, x);
    }
}