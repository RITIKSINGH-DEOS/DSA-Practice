import java.util.*;

public class MaxLengthChain {

    public static void main(String[] args) {

        int pairs[][] = {
            {5, 24},
            {39, 60},
            {5, 28},
            {27, 40},
            {50, 90}
        };

        // Sort according to second element
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));

        int chainLength = 0;
        int lastEnd = Integer.MIN_VALUE;

        for (int i = 0; i < pairs.length; i++) {

            // Check if current pair can be added
            if (pairs[i][0] > lastEnd) {

                chainLength++;
                lastEnd = pairs[i][1];

                System.out.println(
                    "(" + pairs[i][0] + ", " + pairs[i][1] + ")"
                );
            }
        }

        System.out.println("Maximum Chain Length = " + chainLength);
    }
}