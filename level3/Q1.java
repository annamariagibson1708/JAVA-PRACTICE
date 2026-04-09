import java.util.Random;

public class Q1{
    public static void main(String[] args) {
        // Create an int array named heights of size 11
        int[] heights = new int[11];
        Random random = new Random();

        // Populate with random heights between 150 and 250 cms
        System.out.print("Player Heights (cms): ");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt((250 - 150) + 1) + 150;
            System.out.print(heights[i] + " ");
        }

        // Display Results
        System.out.println("\n\n--- Team Statistics ---");
        System.out.println("Shortest Height: " + findShortest(heights) + " cms");
        System.out.println("Tallest Height: " + findTallest(heights) + " cms");
        System.out.printf("Mean Height: %.2f cms\n", calculateMean(heights));
    }

    // Method to Find the sum of all elements
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int h : arr) {
            sum += h;
        }
        return sum;
    }

    // Method to find the mean height
    public static double calculateMean(int[] arr) {
        return (double) calculateSum(arr) / arr.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) min = h;
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) max = h;
        }
        return max;
    }
}

