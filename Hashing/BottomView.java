import java.util.*;

public class BottomView {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void bottomView(Node root) {

        if (root == null) {
            return;
        }

        // Horizontal Distance -> Node value
        TreeMap<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();

        // Root ka horizontal distance = 0
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair current = q.remove();

            Node node = current.node;
            int hd = current.hd;

            // Same HD par new node purane node ko replace karega
            map.put(hd, node.data);

            if (node.left != null) {
                q.add(new Pair(node.left, hd - 1));
            }

            if (node.right != null) {
                q.add(new Pair(node.right, hd + 1));
            }
        }

        // Sorted horizontal distance ke according print
        for (int value : map.values()) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {

        Node root = new Node(20);

        root.left = new Node(8);
        root.right = new Node(22);

        root.left.left = new Node(5);
        root.left.right = new Node(3);

        root.right.right = new Node(25);

        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        bottomView(root);
    }
}