import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[] ages = new int[10];
        Scanner sc = new Scanner(System.in);

        // Take user input for 10 students
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Loop through array and check voting capability
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + "): Invalid age.");
            } else if (ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + "): The student can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + "): The student cannot vote.");
            }
        }
        sc.close();
    }
}
