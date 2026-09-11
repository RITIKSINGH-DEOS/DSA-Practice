import java.util.Scanner;

public class rlg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();

        System.out.println(a > b);
        System.out.println(b > a);
        System.out.println(b > c);
        System.out.println(a > b && b > c);
        System.out.println(a == b || b == c);

    }
}
