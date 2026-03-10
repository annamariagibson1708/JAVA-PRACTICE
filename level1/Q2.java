import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        boolean isSmallest = (num1 <= num2 && num1 <= num3);
        String result = isSmallest ? "Yes" : "No";

        System.out.println("Is the first number the smallest? " + result);
        
        scanner.close();
    }
}