public class KthLargestOddNumberInAGivenRange {

    public static int kthLargestOdd(int L, int R, int K) {

        int largestOdd;

        if (R % 2 == 0) {
            largestOdd = R - 1;
        } else {
            largestOdd = R;
        }

        int answer = largestOdd - 2 * (K - 1);

        if (answer < L) {
            return 0;
        }

        return answer;
    }

    public static void main(String[] args) {

        int L = -3;
        int R = 3;
        int K = 1;

        System.out.println(kthLargestOdd(L, R, K));
    }
}