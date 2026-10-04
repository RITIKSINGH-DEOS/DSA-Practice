package Day5;

import java.util.*;

public class DuplicateElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    int duplicate = arr[i];
                    System.out.println(duplicate);
                    return;
                }
            }
        }
    }
}