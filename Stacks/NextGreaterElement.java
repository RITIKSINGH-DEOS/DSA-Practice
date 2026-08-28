import java.util.*;

public class NextGreaterElement {

    public static void nextGreater(int arr[], int result[]) {

        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            // Smaller elements remove
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // Greater element
            if (s.isEmpty()) {
                result[i] = -1;
            } 
            else {
                result[i] = arr[s.peek()];
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {

        int arr[] = {6, 8, 0, 1, 3};

        int result[] = new int[arr.length];

        nextGreater(arr, result);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}