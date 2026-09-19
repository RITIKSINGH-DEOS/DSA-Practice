public class CountPrime {

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int countPrime(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (isPrime(arr[i])) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 7, 10, 11};

        int result = countPrime(arr);

        System.out.println(result);
    }
}