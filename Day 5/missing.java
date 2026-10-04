package Day5;

import java.util.*;

public class Missing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        int actualSum = 0;
        int expectedSum = 0;

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
            actualSum = actualSum + arr[i];
        }

        for (int i = 1; i <= n; i++) {
            expectedSum = expectedSum + i;
        }

        int missing = expectedSum - actualSum;

        System.out.println(missing);
    }
}