import java.util.*;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = sc.nextInt();
        System.out.println("Enter number b");
        int b = sc.nextInt();
        System.out.println("Enter number c");
        int c = sc.nextInt();

        double avg = (double) (a + b + c) / 3;
        System.out.println(avg);

    }
}
