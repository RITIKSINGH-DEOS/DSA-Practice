package Day2;
import java.util.*;

public class count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;

        for(int i = 1; i<=n; i++){
            if(i % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }

        System.out.println(even);
        System.out.println(odd);


    }
}
