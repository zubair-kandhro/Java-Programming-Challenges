package CH6;

import java.util.*;
class Die1 {
    private int sides;
    private int faceValue;
    private Random random;

    public Die1(int sides) {
        this.sides = sides;
        random = new Random();
    }

    public void roll() {
        faceValue = random.nextInt(sides) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}

public class FishingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Die1 die = new Die1(6);
        int totalPoints = 0;

        System.out.println("Welcome to the Fishing Game!");

        boolean continueFishing = true;
        while (continueFishing) {
            System.out.print("Do you want to fish for more items? (yes/no): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("yes")) {
                die.roll();
                int itemNumber = die.getFaceValue();

                int points = 0;
                String itemName;

                switch (itemNumber) {
                    case 1:
                        points = 10;
                        itemName = "a huge fish";
                        break;
                    case 2:
                        points = 1;
                        itemName = "an old shoe";
                        break;
                    case 3:
                        points = 5;
                        itemName = "a little fish";
                        break;
                    // Add more cases for other items
                    default:
                        points = 0;
                        itemName = "nothing";
                        break;
                }

                totalPoints += points;
                System.out.println("You caught " + itemName + " and earned " + points + " points.");
            } else {
                continueFishing = false;
            }
        }

        System.out.println("\nYou finished fishing!");
        System.out.println("Total fishing points: " + totalPoints);

        if (totalPoints >= 20) {
            System.out.println("Congratulations! You are a great fisherman!");
        } else if (totalPoints >= 10) {
            System.out.println("Not bad! You caught some fish.");
        } else {
            System.out.println("Keep practicing! You need more fishing points.");
        }


    }
}

