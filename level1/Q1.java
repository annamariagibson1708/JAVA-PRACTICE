import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double si = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + si + " for Principle " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time);
    }

    //calculate Simple Interest
    public static double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}

