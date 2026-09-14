package Day3;

import java.util.*;

public class multipara {

    public static double avg(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double x = avg(a, b, c);
        System.out.println(x);

    }
}
