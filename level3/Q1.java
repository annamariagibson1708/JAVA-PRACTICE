package level3; 
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Take Celsius input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // 2. Apply formula: (°C × 9/5) + 32 = °F
        double fahrenheitResult = (celsius * 9.0 / 5.0) + 32;

        // 3. Final Output
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

        input.close();
    }
}

