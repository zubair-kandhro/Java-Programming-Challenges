package CH5;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {

    public static String getComputerChoice() {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;

        switch (randomNumber) {
            case 1:
                return "rock";
            case 2:
                return "paper";
            case 3:
                return "scissors";
            default:
                return "";
        }
    }

    public static String getUserChoice(Scanner scanner) {
        System.out.println("Enter your choice (rock, paper, or scissors): ");
        return scanner.next().toLowerCase();
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie! Both players chose " + userChoice + ".";
        }

        if ((userChoice.equals("rock") && computerChoice.equals("scissors"))
                || (userChoice.equals("scissors") && computerChoice.equals("paper"))
                || (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            return "Congratulations! You win! You chose " + userChoice + " and the computer chose " + computerChoice + ".";
        }

        return "Sorry, you lose! The computer chose " + computerChoice + " and you chose " + userChoice + ".";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors!");

        boolean playAgain;
        do {
            String computerChoice = getComputerChoice();
            String userChoice = getUserChoice(scanner);

            System.out.println("Computer chose: " + computerChoice);
            System.out.println(determineWinner(userChoice, computerChoice));

            System.out.println("Do you want to play again? (yes/no)");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        } while (playAgain);

        System.out.println("Thank you for playing Rock, Paper, Scissors!");
    }
}
