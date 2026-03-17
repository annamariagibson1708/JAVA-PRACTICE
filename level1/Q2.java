import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        // 1. Get user input for 5 elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // 2. Loop through and check properties
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even");
                } else {
                    System.out.println(num + " is positive and odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println("Zero");
            }
        }

        // 3. Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("The first and last elements are equal.");
        } else if (first > last) {
            System.out.println("The first element (" + first + ") is greater than the last (" + last + ").");
        } else {
            System.out.println("The first element (" + first + ") is less than the last (" + last + ").");
        }
        
        input.close();
    }
}

