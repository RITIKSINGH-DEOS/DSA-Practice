package Day5;

import java.util.*;

public class arraysmallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];
        int secondSmallest = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println(secondSmallest);
    }
}