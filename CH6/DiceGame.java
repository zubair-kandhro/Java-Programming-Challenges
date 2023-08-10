package CH6;

import java.util.Random;

class Die {
    private int sides;
    private int faceValue;
    private Random random;

    public Die(int sides) {
        this.sides = sides;
        random = new Random();
        roll();
    }

    public void roll() {
        faceValue = random.nextInt(sides) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}

public class DiceGame {
    public static void main(String[] args) {
        Die computerDie = new Die(6);
        Die userDie = new Die(6);

        int computerWins = 0;
        int userWins = 0;

        for (int i = 1; i <= 10; i++) {
            computerDie.roll();
            userDie.roll();

            int computerValue = computerDie.getFaceValue();
            int userValue = userDie.getFaceValue();

            System.out.println("Roll " + i + ": Computer's Die: " + computerValue + " | User's Die: " + userValue);

            if (computerValue > userValue) {
                computerWins++;
            } else if (userValue > computerValue) {
                userWins++;
            }
        }

        System.out.println("\nFinal Results:");
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("User Wins: " + userWins);

        if (computerWins > userWins) {
            System.out.println("Grand Winner: Computer");
        } else if (userWins > computerWins) {
            System.out.println("Grand Winner: User");
        } else {
            System.out.println("No Grand Winner (Tie)");
        }
    }
}

