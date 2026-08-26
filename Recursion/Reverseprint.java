import java.util.*;

public class Reverseprint {

    public static void count(int num) {
        // Base case
        if (num == 0) {
            return;
        }

        System.out.println(num);

        // Recursive call
        count(num - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        count(num);

    }
}