import java.util.*;

public class DuplicateSubtrees {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static HashMap<String, Integer> map;
    static ArrayList<Node> result;

    public static String findDuplicateSubtrees(Node root) {

        if (root == null) {
            return "#";
        }

        String left = findDuplicateSubtrees(root.left);
        String right = findDuplicateSubtrees(root.right);

        String current = root.data + "," + left + "," + right;

        int frequency = map.getOrDefault(current, 0);

        if (frequency == 1) {
            result.add(root);
        }

        map.put(current, frequency + 1);

        return current;
    }

    public static ArrayList<Node> getDuplicateSubtrees(Node root) {

        map = new HashMap<>();
        result = new ArrayList<>();

        findDuplicateSubtrees(root);

        return result;
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

        root.left = new Node(4);
        root.right = new Node(3);

        root.left.left = new Node(3);
        root.left.right = new Node(4);

        root.right.left = new Node(3);
        root.right.left.left = new Node(3);

        ArrayList<Node> duplicates = getDuplicateSubtrees(root);

        for (Node node : duplicates) {
            preorder(node);
            System.out.println();
        }
    }
}