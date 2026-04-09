import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        int[] factors = getFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        
        System.out.println("\nSum of factors: " + calculateSum(factors));
        System.out.println("Product of factors: " + calculateProduct(factors));
        System.out.println("Sum of squares of factors: " + calculateSumOfSquares(factors));
    }

    // Static Method to find factors and return an array
    public static int[] getFactors(int n) {
        int count = 0;
        // First loop: find the count
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        // Initialize array and second loop: save factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return sum;
    }

    public static long calculateProduct(int[] arr) {
        long product = 1;
        for (int val : arr) product *= val;
        return product;
    }

    public static double calculateSumOfSquares(int[] arr) {
        double sumSquares = 0;
        for (int val : arr) {
            sumSquares += Math.pow(val, 2);
        }
        return sumSquares;
    }
}

