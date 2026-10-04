package Day5;

public class ConcatenationofArray {
    public static void main(String[] args) {

        int[] nums = {1, 4, 1, 2};

        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}