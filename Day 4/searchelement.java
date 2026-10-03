package Day4;

import java.util.*;

public class searchelement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter your numbers");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter your element");
        int k = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (k == arr[i]) {
                System.out.println(k);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
    }
}