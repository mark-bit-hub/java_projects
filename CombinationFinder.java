import java.util.Scanner;

public class CombinationFinder {
    // Method to add two numbers
    public static int addCombination(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find all combinations of two numbers that add up to it:");

        // Validate input
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.next(); // Clear invalid input
        }
        int num = scanner.nextInt();

        // Find and print combinations
        System.out.println("Combinations that add up to " + num + ":");
        for (int i = 0; i <= num; i++) {
            int j = num - i;
            System.out.println("{" + i + ", " + j + "} = " + addCombination(i, j));
        }

        scanner.close();
    }
}