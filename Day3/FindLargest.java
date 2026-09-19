public class FindLargest {

    public static int findLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {10, 45, 20, 8, 35};

        int result = findLargest(arr);

        System.out.println(result);
    }
}