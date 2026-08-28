import java.util.*;

public class ReverseString {

    public static String reverse(String str) {

        Stack<Character> s = new Stack<>();

        // Characters stack me push
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        // Stack se pop karke reverse string
        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str = "abcde";

        System.out.println(reverse(str));
    }
}