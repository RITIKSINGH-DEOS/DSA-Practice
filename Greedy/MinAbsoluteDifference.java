import java.util.*;

public class MinAbsoluteDifference {

    public static void main(String[] args) {

        int A[] = {1, 2, 3};
        int B[] = {2, 1, 3};

        // Step 1: Sort both arrays
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;

        // Step 2: Pair same index elements
        for (int i = 0; i < A.length; i++) {

            sum += Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum Absolute Difference = " + sum);
    }
}