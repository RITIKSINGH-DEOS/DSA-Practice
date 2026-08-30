import java.util.*;

public class FractionalKnapsack {

    public static void main(String[] args) {

        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};

        int W = 50;

        // value/weight ratio store karne ke liye
        double ratio[][] = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i; // item index
            ratio[i][1] = (double) value[i] / weight[i];
        }

        // Highest ratio pehle
        Arrays.sort(ratio, Comparator.comparingDouble(
                (double[] o) -> o[1]
        ).reversed());

        int capacity = W;
        int maxValue = 0;

        for (int i = 0; i < ratio.length; i++) {

            int index = (int) ratio[i][0];

            // Agar pura item aa sakta hai
            if (capacity >= weight[index]) {

                maxValue += value[index];
                capacity -= weight[index];

            } 
            // Agar pura item nahi aa sakta
            else {

                maxValue += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }

        System.out.println("Maximum Value = " + maxValue);
    }
}