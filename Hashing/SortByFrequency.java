import java.util.*;

public class SortByFrequency {

    public static String frequencySort(String s) {

        // Character -> Frequency
        HashMap<Character, Integer> map = new HashMap<>();

        // Frequency count
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Characters ko frequency ke according sort karo
        List<Character> chars = new ArrayList<>(map.keySet());

        chars.sort((a, b) ->
            map.get(b) - map.get(a)
        );

        StringBuilder result = new StringBuilder();

        // Characters ko frequency times add karo
        for (char ch : chars) {

            int frequency = map.get(ch);

            for (int i = 0; i < frequency; i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "tree";

        System.out.println(frequencySort(s));
    }
}