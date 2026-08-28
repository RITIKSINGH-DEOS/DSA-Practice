import java.util.*;

public class DequeJCF {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // Add
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println(dq);

        // Peek
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        // Remove
        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq);
    }
}