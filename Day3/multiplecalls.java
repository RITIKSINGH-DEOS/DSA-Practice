public class multilplecalls{

    public static int square(int n){
        return n*n;
    }
    public static void main(String[] args){
        int a = square(5);
    int b = square(10);
    int c = square(7);

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    }
}