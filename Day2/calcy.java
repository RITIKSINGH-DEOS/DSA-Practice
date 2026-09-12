package Day2;

import java.util.Scanner;

public class Calcy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        char operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println(a + b);

        } else if (operator == '-') {
            System.out.println(a - b);

        } else if (operator == '*') {
            System.out.println(a * b);

        } else if (operator == '/') {

            if (b == 0) {
                System.out.println("Cannot divide by zero");
            } else {
                System.out.println(a / b);
            }

        } else if (operator == '%') {

            if (b == 0) {
                System.out.println("Cannot divide by zero");
            } else {
                System.out.println(a % b);
            }

        } else {
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}