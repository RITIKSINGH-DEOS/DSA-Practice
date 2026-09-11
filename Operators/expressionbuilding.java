import java.util.*;

public class expressionbuilding {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();

        int Sum = a + b;
        int Difference = a - b;
        int Product = a * b;
        int Quotient = a / b;
        int Remainder = a % b;

        System.out.println(Sum);
        System.out.println(Difference);
        System.out.println(Product);
        System.out.println(Quotient);
        System.out.println(Remainder);


    }
}
