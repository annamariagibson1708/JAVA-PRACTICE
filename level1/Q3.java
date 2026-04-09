import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangular park (in meters):");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        double roundsNeeded = calculateRounds(side1, side2, side3);

        System.out.printf("To complete a 5km run, the athlete must complete %.2f rounds.\n", roundsNeeded);
    }

    // Method to compute rounds needed for 5km (5000 meters)
    public static double calculateRounds(double s1, double s2, double s3) {
        double perimeter = s1 + s2 + s3;
        double totalDistance = 5000; // 5km in meters
        return totalDistance / perimeter;
    }
}
