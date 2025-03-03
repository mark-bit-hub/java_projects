import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] moves = {"Rock", "Paper", "Scissors"};
        boolean playAgain = true;

        while (playAgain) {
            // Computer's move
            int rand = (int) (3 * Math.random());
            String computerMove = moves[rand];

            // Player's move
            System.out.print("Enter your move (Rock, Paper, Scissors): ");
            String playerMove = scanner.nextLine().trim();

            // Validate input
            while (!playerMove.equalsIgnoreCase("Rock") &&
                    !playerMove.equalsIgnoreCase("Paper") &&
                    !playerMove.equalsIgnoreCase("Scissors")) {
                System.out.print("Invalid move. Please enter Rock, Paper, or Scissors: ");
                playerMove = scanner.nextLine().trim();
            }

            // Determine the winner
            System.out.println("Computer chose: " + computerMove);
            System.out.println("You chose: " + playerMove);

            if (playerMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors")) ||
                    (playerMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock")) ||
                    (playerMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            // Ask to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.nextLine().trim();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}