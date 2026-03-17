import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Arrays to store name, age, and height for 3 friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // 1. Take user input for Age and Height
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = input.nextInt();
            System.out.print("Height: ");
            heights[i] = input.nextDouble();
        }

        // 2. Initialize tracking variables for youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // 3. Loop through arrays to find youngest (min age) and tallest (max height)
        for (int i = 1; i < 3; i++) {
            // Find youngest
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            // Find tallest
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // 4. Finally display results
        System.out.println("\n--- Results ---");
        System.out.println("The youngest friend is " + names[youngestIndex] + 
                           " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex] + 
                           " with height " + heights[tallestIndex]);

        input.close();
    }
}
