import java.util.*;

public class Pushatbottom {

    public static void pushAtBottom(Stack<Integer> s, int data) {

        // Base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // Top element temporarily remove
        int top = s.pop();

        // Bottom par data insert
        pushAtBottom(s, data);

        // Removed element wapas push
        s.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        System.out.println(s);
    }
}