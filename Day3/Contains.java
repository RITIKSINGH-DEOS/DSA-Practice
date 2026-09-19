public class Contains {

    public static boolean contains(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        boolean result = contains(arr, 30);

        System.out.println(result);
    }
}