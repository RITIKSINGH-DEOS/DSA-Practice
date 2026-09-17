package Day3;

public class FunMarks {

    public static String getGrade(int marks) {

        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        String result = getGrade(25);
        System.out.println(result);
    }
}