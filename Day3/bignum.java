public class bignum {
    public static int max(int a, int b) {

        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = max(a,b);
        System.out.println(result);
    }
}