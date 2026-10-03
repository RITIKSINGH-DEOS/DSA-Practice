package Day 4;

import java.util.*;

public class arrayavg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int sum = 0;

         for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }

        double avg = (double)sum/n;
        System.out.println(avg);

    }
}
