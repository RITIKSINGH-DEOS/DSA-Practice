public class removeduplicate {
    static void removeDuplicates(String str, int index, String result) {

        if (index == str.length()) {
            System.out.println(result);
            return;
        }

        char ch = str.charAt(index);

        if (!result.contains(String.valueOf(ch))) {
            result = result + ch;
        }

        removeDuplicates(str, index + 1, result);
    }

    public static void main(String[] args) {
        removeDuplicates("apple", 0, "");
    }
}
