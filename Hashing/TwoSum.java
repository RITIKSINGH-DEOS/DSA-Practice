import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int needed = target - arr[i];

            // Kya required number pehle aa chuka hai?
            if (map.containsKey(needed)) {

                return new int[] {
                    map.get(needed),
                    i
                };
            }

            // Number -> Index
            map.put(arr[i], i);
        }

        // Agar solution nahi mila
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] answer = twoSum(arr, target);

        System.out.println(
            "[" + answer[0] + ", " + answer[1] + "]"
        );
    }
}