public class CountSameCharacterSubstrings {

    public static int countSubstrings(String str) {

        return countSubstrings(str, 0, str.length() - 1);
    }

    public static int countSubstrings(String str, int start, int end) {

        if (start > end) {
            return 0;
        }

        int count = 0;

        for (int i = start; i <= end; i++) {

            if (str.charAt(start) == str.charAt(i)) {
                count++;
            }
        }

        return count + countSubstrings(str, start + 1, end);
    }

    public static void main(String[] args) {

        String str = "abcab";

        System.out.println(countSubstrings(str));
    }
}