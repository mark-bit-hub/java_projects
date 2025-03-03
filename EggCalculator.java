import java.util.Scanner;

public class EggCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of eggs: ");

        // Validate input
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a positive number: ");
            scanner.next(); // Clear invalid input
        }
        int numEggs = scanner.nextInt();

        if (numEggs < 0) {
            System.out.println("Number of eggs cannot be negative.");
        } else {
            // Calculate gross, dozen, and remainder
            int gross = numEggs / 144;
            int dozen = (numEggs % 144) / 12;
            int remainder = numEggs % 12;

            System.out.println("You have " + gross + " gross, " + dozen + " dozen, and " + remainder + " eggs.");
        }

        scanner.close();
    }
}