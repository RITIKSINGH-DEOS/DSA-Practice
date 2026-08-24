import java.util.*;

public class anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string");
        String str1 = sc.nextLine();

        System.out.println("Enter second string");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {

            System.out.println("Not Anagram");

        } else {

            boolean[] used = new boolean[str2.length()];
            boolean isAnagram = true;

            for (int i = 0; i < str1.length(); i++) {

                boolean found = false;

                for (int j = 0; j < str2.length(); j++) {

                    if (str1.charAt(i) == str2.charAt(j) && !used[j]) {

                        used[j] = true;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
    }
}