package Day4;

import java.util.*;

public class Asc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ascending = true;

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                ascending = false;
                break;
            }
        }

        if (ascending) {
            System.out.println("Ascending");
        } else {
            System.out.println("Not Ascending");
        }
    }
}