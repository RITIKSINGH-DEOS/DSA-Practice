public class FindSmallest
 {

    public static int findSmallest(int[] arr) {

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {

        int[] arr = {10, 45, 20, 8, 35};

        int result = findSmallest(arr);

        System.out.println(result);
    }
}