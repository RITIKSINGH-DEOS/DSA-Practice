import java.util.*;

public class power {

    public static int Power(int n, int p) {
        if (p == 0) {
            return 1;
        }

        return n * Power(n, p - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        System.out.println("Enter your power");
        int p = sc.nextInt();

        System.out.println(Power(n, p));
    }
}
