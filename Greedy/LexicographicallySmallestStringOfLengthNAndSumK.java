public class LexicographicallySmallestStringOfLengthNAndSumK {

    public static String smallestString(int N, int K) {

        char[] result = new char[N];

        for (int i = 0; i < N; i++) {
            result[i] = 'a';
        }

        int remaining = K - N;

        for (int i = N - 1; i >= 0 && remaining > 0; i--) {

            int add = Math.min(25, remaining);

            result[i] = (char) (result[i] + add);

            remaining -= add;
        }

        return new String(result);
    }

    public static void main(String[] args) {

        int N = 5;
        int K = 42;

        System.out.println(smallestString(N, K));
    }
}