public class TopDown {

    public static int fib(int n, int dp[]) {

        // Base Case
        if (n == 0 || n == 1) {
            return n;
        }

        // Already calculated
        if (dp[n] != -1) {
            return dp[n];
        }

        // Recursive call + store answer
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 5;

        int dp[] = new int[n + 1];

        // Initialize with -1
        Arrays.fill(dp, -1);

        System.out.println(fib(n, dp));
    }
}