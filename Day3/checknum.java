public class CheckNum {

    public static String checkNumber(int n) {

        if (n > 0) {
            return "Positive";
        } else if (n < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static void main(String[] args) {

        String result = checkNumber(-5);

        System.out.println(result);
    }
}