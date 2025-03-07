import java.util.Random;
import java.util.Scanner;

public class GuessPin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your PIN (1-1000): ");
        int pin = scanner.nextInt();

        int guess;
        int attempts = 0;

        while (true) {
            guess = random.nextInt(1000) + 1;
            attempts++;

            if (guess == pin) {
                System.out.println("PIN: " + pin + "\nLogin Successful!\nGuessed in " + attempts + " attempts.");
                break;
            } else {
                System.out.println("Guessed PIN: " + guess + ", Attempt: " + attempts);
            }
        }
        scanner.close();
    }
}
