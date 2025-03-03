import java.util.Scanner;

public class PasswordVerification {
    public static void main(String[] args) {
        String correctPassword = "Punge";
        Scanner scanner = new Scanner(System.in);
        boolean isAuthenticated = false;

        // Allow 3 attempts
        int attempts = 3;
        while (attempts > 0 && !isAuthenticated) {
            System.out.print("Enter your password: ");
            String userInput = scanner.nextLine();

            if (userInput.equals(correctPassword)) {
                isAuthenticated = true;
                System.out.println("Login successful!");
            } else {
                attempts--;
                System.out.println("Incorrect password. " + attempts + " attempts remaining.");
            }
        }

        if (!isAuthenticated) {
            System.out.println("Access denied. No more attempts left.");
        }

        scanner.close();
    }
}