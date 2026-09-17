package Day3;

public class SimpleInterest {

    public static double calculateSimpleInterest(double p, double r, double t) {

        double si = (p * r * t) / 100;

        return si;
    }

    public static void main(String[] args) {

        double result = calculateSimpleInterest(10000, 5, 2);

        System.out.println(result);
    }
}