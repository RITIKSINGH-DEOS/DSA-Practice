package Day2;

import java.util.*;

public class whileloo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;

   while (i <= n) {

    if (i == 20) {
        break;
    }

   
    if (i % 5 == 0) {
         i++;
        continue;
    }

    System.out.println(i);

}
}
