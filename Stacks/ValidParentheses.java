import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            }

            // Closing bracket
            else {

                if (s.isEmpty()) {
                    return false;
                }

                char top = s.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {

                    return false;
                }
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {

        String str = "([{}])";

        System.out.println(isValid(str));
    }
}