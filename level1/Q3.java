import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        // Comparison logic for each position
        System.out.println("Is the first number the largest? " + (n1 >= n2 && n1 >= n3 ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (n2 >= n1 && n2 >= n3 ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (n3 >= n1 && n3 >= n2 ? "Yes" : "No"));

        scanner.close();
    }
}
