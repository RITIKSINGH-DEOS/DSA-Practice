public class ReversePrint {

    public static void reversePrint(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        reversePrint(arr);
    }
}