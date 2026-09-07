public class SplitTheGivenArrayIntoKSubarrays {

    public static int splitArray(int[] arr, int K) {

        int low = 0;
        int high = 0;

        for (int num : arr) {
            low = Math.max(low, num);
            high += num;
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (canSplit(arr, K, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static boolean canSplit(int[] arr, int K, int maxSum) {

        int subarrays = 1;
        int currentSum = 0;

        for (int num : arr) {

            if (currentSum + num <= maxSum) {
                currentSum += num;
            } else {

                subarrays++;
                currentSum = num;

                if (subarrays > K) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int K = 3;

        System.out.println(splitArray(arr, K));
    }
}