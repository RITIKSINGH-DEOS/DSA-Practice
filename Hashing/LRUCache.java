import java.util.*;

public class LRUCache {

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;

    private HashMap<Integer, Node> map;

    private Node head;
    private Node tail;

    public LRUCache(int capacity) {

        this.capacity = capacity;
        map = new HashMap<>();

        // Dummy nodes
        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    // Node ko list se remove karna
    private void remove(Node node) {

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Node ko head ke paas add karna
    private void addToFront(Node node) {

        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        // Recently used banane ke liye front me move
        remove(node);
        addToFront(node);

        return node.value;
    }

    public void put(int key, int value) {

        // Agar key already exist karti hai
        if (map.containsKey(key)) {

            Node node = map.get(key);

            node.value = value;

            remove(node);
            addToFront(node);

            return;
        }

        // New node
        Node newNode = new Node(key, value);

        map.put(key, newNode);
        addToFront(newNode);

        // Capacity exceed ho gayi
        if (map.size() > capacity) {

            // Tail ke just pehle wala = least recently used
            Node lru = tail.prev;

            remove(lru);
            map.remove(lru.key);
        }
    }
}