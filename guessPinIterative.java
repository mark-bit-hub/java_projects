import java.util.Scanner;

public class GuessPinIterative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your PIN (1-10000): ");
        int pin = scanner.nextInt();

        for (int attempt = 1; attempt <= 10000; attempt++) {
            if (attempt == pin) {
                System.out.println("PIN: " + pin + "\nLogin Successful!\nGuessed in " + attempt + " attempts.");
                break;
            } else {
                System.out.println("Attempt: " + attempt);
            }
        }
        scanner.close();
    }
}
