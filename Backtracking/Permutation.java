public class Permutation {

    public static void findPermutation(String str, String ans) {

        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Har character ko ek-ek baar current position par rakhenge
        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            // Current character ko hata kar remaining string
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Recursion
            findPermutation(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {

        String str = "abc";

        findPermutation(str, "");
    }
}