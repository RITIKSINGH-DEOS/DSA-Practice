package Day3;

public class PrimeCheck {

    public static boolean isPrime(int n) {

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {

        int n = 7;

        boolean result = isPrime(n);

        System.out.println(result);
    }
}