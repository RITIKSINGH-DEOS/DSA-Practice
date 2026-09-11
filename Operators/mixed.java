import java.util.*;

public class mixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amt");
        int p = sc.nextInt();
        System.out.println("Enter rate amt");
        double r = sc.nextDouble();
        System.out.println("Enter time");
        int t = sc.nextInt();

        double SI = (double) (p * r * t) / 100;

        System.out.println("Simple Interest" + SI);

        double tmt = (double) SI + p;
        System.out.println("Total Amount" + tmt);

    }
}
