import java.util.*;

public class arraychecknum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i<n; i++ ){
            if(arr[i] > 0){
                positive++;
            }else if (arr[i]<0){
                negative++;
            }else {
                zero++;
            }
        }

        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);


    }

}
