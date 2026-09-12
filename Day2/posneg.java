package Day2;

import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0 && n % 2 == 0) {
            System.out.println("Positive + even");
        } else if (n < 0 && n % 2 != 0) {
            System.out.println("negative + odd");
        } else if (n < 0 && n % 2 == 0) {
            System.out.println("negative + even");
        } else if (n > 0 && n % 2 != 0) {
            System.out.println("positive + odd");
        } else {
            System.out.println("zero");
        }
    }

}
