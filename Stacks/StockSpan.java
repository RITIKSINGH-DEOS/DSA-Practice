import java.util.*;

public class StockSpan {

    public static void stockSpan(int prices[], int span[]) {

        Stack<Integer> s = new Stack<>();

        // First day's span
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < prices.length; i++) {

            // Smaller/equal prices remove
            while (!s.isEmpty() && prices[i] >= prices[s.peek()]) {
                s.pop();
            }

            // No greater element on left
            if (s.isEmpty()) {
                span[i] = i + 1;
            } 
            else {
                span[i] = i - s.peek();
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {

        int prices[] = {100, 80, 60, 70, 60, 75, 85};

        int span[] = new int[prices.length];

        stockSpan(prices, span);

        for (int x : span) {
            System.out.print(x + " ");
        }
    }
}