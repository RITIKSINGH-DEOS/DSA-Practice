import java.util.*;

public class Lowercasestr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your str");
        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {

                count++;
            }
        }

        if (count == 0) {
            System.out.println("No str");
        } else {
            System.out.println("Total lowercase str: " + count);
        }

    }
}