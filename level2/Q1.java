import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays for 10 employees
        double[] salaries = new double[10];
        double[] serviceYears = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalOldSalary = 0, totalNewSalary = 0, totalBonusPayout = 0;

        // 1. Input Loop with Validation
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter Salary: ");
            double sal = input.nextDouble();
            System.out.print("Enter Years of Service: ");
            double years = input.nextDouble();

            // Check for invalid numbers
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; // Decrement counter to repeat this index
                continue;
            }

            salaries[i] = sal;
            serviceYears[i] = years;
        }

        // 2. Calculation Loop
        for (int i = 0; i < 10; i++) {
            double bonusPercent = (serviceYears[i] > 5) ? 0.05 : 0.02;
            
            bonuses[i] = salaries[i] * bonusPercent;
            newSalaries[i] = salaries[i] + bonuses[i];

            // Accumulate totals
            totalOldSalary += salaries[i];
            totalBonusPayout += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        // 3. Final Output
        System.out.println("\nZara Payroll:");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonusPayout);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        input.close();
    }
}
