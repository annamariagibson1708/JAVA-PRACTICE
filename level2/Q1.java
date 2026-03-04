package level2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Performing Arithmetic Operations
        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;

        // Final Output
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
                            + number1 + " and " + number2 + " is " 
                            + add + ", " + sub + ", " + mul + ", and " + div);
        
        input.close();
    }
}
