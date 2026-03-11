import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year (1582 or later): ");
        int year = input.nextInt();

        // 1. Initial Gregorian Calendar Check
        if (year < 1582) {
            System.out.println("Error: The Gregorian calendar started in 1582.");
        } else {
            
            // --- PART 1: Multiple If-Else Statements ---
            System.out.println("\n[Result using multiple if-else]");
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }

            // --- PART 2: Single If Statement with Logical Operators ---
            System.out.println("\n[Result using one if statement]");
            // Logic: Divisible by 400 OR (Divisible by 4 AND NOT divisible by 100)
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        input.close();
    }
}
