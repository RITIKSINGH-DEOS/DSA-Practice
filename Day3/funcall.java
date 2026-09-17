package Day3;

public class funcall {

    public static int square(int n) {
        return n * n;
    }

    public static int sumOfSquares(int a, int b) {
        int x = square(a) + square(b);
        return x;
    }

    public static void main(String[] args) {
        int result = sumOfSquares(3, 4);
        System.out.println(result);
    }
}
