public class maxPartitions {

    public static int maxPartitions(String str) {
        int balance = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'L') {
                balance++;
            } else {
                balance--;
            }

            if (balance == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String str = "LRRRLLRLLRLR";

        System.out.println(maxPartitions(str));
    }
}