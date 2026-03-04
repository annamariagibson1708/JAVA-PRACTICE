package level2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking inputs in cm
        System.out.print("Enter the base (cm): ");
        double base = input.nextDouble();
        
        System.out.print("Enter the height (cm): ");
        double height = input.nextDouble();

        // 1. Calculate Area in sq cm (1/2 * b * h)
        double areaSqCm = 0.5 * base * height;

        // 2. Convert sq cm to sq inches 
        // Since 1 inch = 2.54 cm, 1 sq inch = 2.54 * 2.54 sq cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Final Output
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);

        input.close();
    }
}
