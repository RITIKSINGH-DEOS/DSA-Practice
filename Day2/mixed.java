package Day2;

import java.util.*;

public class Mixed {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int positive = 0;
        int negative = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        int largest = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {

            int num = sc.nextInt();

            // Positive / Negative
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }

            // Even / Odd
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            // Sum
            sum += num;

            // Largest
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
        System.out.println("Sum = " + sum);
        System.out.println("Largest = " + largest);

        sc.close();
    }
}