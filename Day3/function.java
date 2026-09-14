package Day3;
import java.util.*;

public class function {
    // public static void greet(String name){
    // System.out.println("Hell0," + name);
    // }

    // public static int getNumber() {
    // return 10;
    // }

    public static int getNumber(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int x = getNumber(a, b);
        System.out.println(x);
    }
}
