import java.util.Scanner;

public class FinalMix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter third number:");
        int c = sc.nextInt();

        // Sum
        int sum = a + b + c;

        // Average
        double avg = (double) (a + b + c) / 3;

        // Maximum
        int max;

        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        // Minimum
        int min;

        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }

        // Logical condition
        boolean condition = a > b && b > c;

        // Output
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("a > b && b > c = " + condition);

        sc.close();
    }
}