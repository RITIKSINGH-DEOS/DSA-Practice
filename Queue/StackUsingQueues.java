package Queue;

public import java.util.*;

public class StackUsingQueues {

    static class Stack {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void push(int data) {

            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            q1.add(data);

            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        public int pop() {

            if (q1.isEmpty()) {
                return -1;
            }

            return q1.remove();
        }

        public int peek() {

            if (q1.isEmpty()) {
                return -1;
            }

            return q1.peek();
        }

        public boolean isEmpty() {
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
        System.out.println(s.peek());
    }
} {
    
}
