public class booleanfun {

    public static boolean isPositive(int n){
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){

        boolean result = isPositive(5);
        System.out.println(result);
    }
}