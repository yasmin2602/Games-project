import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] rps = {"rock", "paper", "scissors"};
        Scanner scanner = new Scanner(System.in);
        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your move (rock, paper, scissors). Type 'exit' to end the game.");

        while (true) {
            System.out.print("Your move: ");
            String playerMove = scanner.nextLine().toLowerCase();

            if (playerMove.equals("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("Invalid move. Please try again.");
                continue;
            }

            String computerMove = rps[new Random().nextInt(rps.length)];
            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie!");
                ties++;
            } else if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
                       (playerMove.equals("paper") && computerMove.equals("rock")) ||
                       (playerMove.equals("scissors") && computerMove.equals("paper"))) {
                System.out.println("You win this round!");
                playerWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }

            System.out.println("Score -> You: " + playerWins + " | Computer: " + computerWins + " | Ties: " + ties);
        }

        System.out.println("\nFinal Score:");
        System.out.println("You: " + playerWins);
        System.out.println("Computer: " + computerWins);
        System.out.println("Ties: " + ties);
        System.out.println("Goodbye!");
        scanner.close();
    }
}
