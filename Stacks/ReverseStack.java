import java.util.*;

public class ReverseStack {

    public static void pushAtBottom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();

        pushAtBottom(s, data);

        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {

        // Base case
        if (s.isEmpty()) {
            return;
        }

        // Top remove
        int top = s.pop();

        // Remaining stack reverse
        reverseStack(s);

        // Removed element bottom par
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverseStack(s);

        System.out.println(s);
    }
}