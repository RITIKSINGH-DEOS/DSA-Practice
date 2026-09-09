public class StringLength {

    public static int findLength(String str, int index) {

        if (index == str.length()) {
            return 0;
        }

        return 1 + findLength(str, index + 1);
    }

    public static void main(String[] args) {

        String str = "Hello";

        System.out.println(findLength(str, 0));
    }
}