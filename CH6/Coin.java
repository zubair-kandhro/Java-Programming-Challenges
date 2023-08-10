package CH6;

import java.util.Random;

public class Coin {
    private String sideUp;

    public Coin() {
        toss(); // Call the toss method to initialize the sideUp field randomly
    }

    public void toss() {
        Random random = new Random();
        int randomNumber = random.nextInt(2); // 0 or 1
        if (randomNumber == 0) {
            sideUp = "Heads";
        } else {
            sideUp = "Tails";
        }
    }

    public String getSideUp() {
        return sideUp;
    }

    public static void main(String[] args) {
        Coin coin = new Coin();
        System.out.println("Initially facing up: " + coin.getSideUp());

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 1; i <= 20; i++) {
            coin.toss();
            System.out.println("Toss " + i + ": " + coin.getSideUp());

            if (coin.getSideUp().equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        System.out.println("\nNumber of Heads: " + headsCount);
        System.out.println("Number of Tails: " + tailsCount);
    }
}

