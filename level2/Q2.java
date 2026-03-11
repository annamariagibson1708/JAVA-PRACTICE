import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
        
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        double bonus = 0;

        // Logical check: more than 5 years
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        // Print the result
        System.out.println("The bonus amount is: " + bonus);
        
        input.close();
    }
}
