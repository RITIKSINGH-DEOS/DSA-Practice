import java.util.Scanner;

public class tilesproblem {

    public static int tilingWays(int n) {

        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return 1;
        }

        return tilingWays(n - 1) + tilingWays(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of tiles");
        int n = sc.nextInt();

        System.out.println(tilingWays(n));
    }

}
