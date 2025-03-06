import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        while (true) {
            System.out.println("Name product (or type 'exit' to finish): ");
            String name = s1.nextLine().trim();

            if (name.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user types "exit"
            }

            System.out.println("Enter price of product: ");
            while (!s1.hasNextInt()) {
                System.out.println("Invalid price input. Please enter a positive number.");
                s1.nextLine(); // Clear invalid input
            }
            int price = s1.nextInt();
            s1.nextLine(); // Consume newline

            System.out.println("Enter amount of product: ");
            while (!s1.hasNextInt()) {
                System.out.println("Invalid quantity input. Please enter a positive number.");
                s1.nextLine(); // Clear invalid input
            }
            int quantity = s1.nextInt();
            s1.nextLine(); // Consume newline

            int remainingQuantity = sale(quantity);
            System.out.println("Remaining quantity: " + remainingQuantity);
        }
        s1.close();
    }

    public static int sale(int sold) {
        return Math.max(sold - 3, 0); // Subtract 3, but ensure the result is not negative
    }
}
