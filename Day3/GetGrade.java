package Day3;

public class GetGrade {

    public static char getGrade(int marks) {

        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        char result = getGrade(82);

        System.out.println(result);
    }
}