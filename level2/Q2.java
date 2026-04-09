import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();

        // Validation
        if (n <= 0) {
            System.out.println("Error: Please enter a positive natural number.");
            return;
        }

        int recursiveResult = sumRecursion(n);
        int formulaResult = sumFormula(n);

        System.out.println("Result using Recursion: " + recursiveResult);
        System.out.println("Result using Formula: " + formulaResult);

        if (recursiveResult == formulaResult) {
            System.out.println("Verification Successful: Both methods produced the same result.");
        }
    }

    // Method to find sum using recursion
    public static int sumRecursion(int n) {
        if (n == 1) return 1;
        return n + sumRecursion(n - 1);
    }

    // Method to find sum using formula: n * (n + 1) / 2
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}
