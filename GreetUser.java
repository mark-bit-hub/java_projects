import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = scanner.nextLine().trim();

        // Validate input
        while (name.isEmpty()) {
            System.out.print("Name cannot be empty. Please enter your name: ");
            name = scanner.nextLine().trim();
        }

        // Greet the user
        String capitalizedName = name.toUpperCase();
        System.out.println("Hello " + capitalizedName + "! Welcome to our system!");

        scanner.close();
    }
}