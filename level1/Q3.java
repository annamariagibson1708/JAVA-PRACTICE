import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Get integer input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // 2. Define an array to store results from 1 to 10
        int[] table = new int[10];
        
        // 3. Run loop to store results in the array
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }
        
        // 4. Display the result from the array in the specified format
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
        
        input.close();
    }
}
