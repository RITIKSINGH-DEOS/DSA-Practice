package Day5;

import java.util.*;

public class MostFrequent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCount = 0;
        int mostFrequent = arr[0];

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }

        System.out.println(mostFrequent);
    }
}