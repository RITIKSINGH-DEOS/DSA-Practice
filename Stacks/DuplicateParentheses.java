import java.util.*;

public class DuplicateParentheses {

    public static boolean hasDuplicate(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ')') {
                s.push(ch);
            }

            else {

                int count = 0;

                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }

                // Opening bracket remove
                if (!s.isEmpty()) {
                    s.pop();
                }

                // Nothing inside ()
                if (count == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String str = "((a+b))";

        System.out.println(hasDuplicate(str));
    }
}