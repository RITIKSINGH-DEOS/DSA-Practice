import java.util.*;

public class MaxHistogram {

    public static int maxArea(int heights[]) {

        Stack<Integer> s = new Stack<>();

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            // Current height smaller than stack top
            while (!s.isEmpty() &&
                   heights[s.peek()] >= heights[i]) {

                int height = heights[s.pop()];

                int width;

                if (s.isEmpty()) {
                    width = i;
                } 
                else {
                    width = i - s.peek() - 1;
                }

                int area = height * width;

                maxArea = Math.max(maxArea, area);
            }

            s.push(i);
        }

        // Remaining elements
        int n = heights.length;

        while (!s.isEmpty()) {

            int height = heights[s.pop()];

            int width;

            if (s.isEmpty()) {
                width = n;
            } 
            else {
                width = n - s.peek() - 1;
            }

            int area = height * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int heights[] = {2, 1, 5, 6, 2, 3};

        System.out.println(maxArea(heights));
    }
}