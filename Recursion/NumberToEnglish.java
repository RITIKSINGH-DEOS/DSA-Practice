public class NumberToEnglish {

    static String words[] = {
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine"
    };

    public static void numberToWords(int num) {

        if (num == 0) {
            return;
        }

        int digit = num % 10;

        numberToWords(num / 10);

        System.out.print(words[digit] + " ");
    }

    public static void main(String[] args) {

        int num = 1947;

        numberToWords(num);
    }
}