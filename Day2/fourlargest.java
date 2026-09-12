package Day2;

import java.util.Scanner;

public class FourLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter third number:");
        int c = sc.nextInt();

        System.out.println("Enter fourth number:");
        int d = sc.nextInt();

        int largest = a;
        int smallest = a;

        if (b > largest) {
            largest = b;
        }

        if (b < smallest) {
            smallest = b;
        }

        if (c > largest) {
            largest = c;
        }

        if (c < smallest) {
            smallest = c;
        }

        if (d > largest) {
            largest = d;
        }

        if (d < smallest) {
            smallest = d;
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);

        sc.close();
    }
}