import java.util.*;

public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int div = a / b;
        double rem = (double) a / b;

        System.out.println("div " + div);
        System.out.println("rem " + rem);
    }
}
