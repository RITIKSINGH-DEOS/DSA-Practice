public class arraysum{

public static int sumArray(int[] arr){
    int sum = 0;
   for(int i = 0; i < arr.length; i++){
        sum = sum + arr[i];
    }

    return sum;
}
  

    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40};

int result = sumArray(arr);

System.out.println(result);
    }
}