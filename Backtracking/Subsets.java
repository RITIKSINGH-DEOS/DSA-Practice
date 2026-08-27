public class Subsets {

    public static void findSubsets(String str, String ans, int i) {

        // Base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        // Choice 1: character ko lena
        findSubsets(str, ans + str.charAt(i), i + 1);

        // Choice 2: character ko nahi lena
        findSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {

        String str = "abc";

        findSubsets(str, "", 0);
    }
}