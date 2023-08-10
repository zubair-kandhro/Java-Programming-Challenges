package CH6;

import java.util.Scanner;

public class RoulettePocket {
    private int pocketNumber;

    public RoulettePocket(int pocketNumber) {
        this.pocketNumber = pocketNumber;
    }

    public String getPocketColor() {
        if (pocketNumber == 0) {
            return "Green";
        } else if (pocketNumber >= 1 && pocketNumber <= 10) {
            return pocketNumber % 2 == 1 ? "Red" : "Black";
        } else if (pocketNumber >= 11 && pocketNumber <= 18) {
            return pocketNumber % 2 == 0 ? "Red" : "Black";
        } else if (pocketNumber >= 19 && pocketNumber <= 28) {
            return pocketNumber % 2 == 1 ? "Red" : "Black";
        } else if (pocketNumber >= 29 && pocketNumber <= 36) {
            return pocketNumber % 2 == 0 ? "Red" : "Black";
        } else {
            return "Invalid Pocket Number";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a pocket number (0-36): ");
        int pocketNumber = scanner.nextInt();

        RoulettePocket roulettePocket = new RoulettePocket(pocketNumber);
        String pocketColor = roulettePocket.getPocketColor();

        System.out.println("Pocket Color: " + pocketColor);

        scanner.close();
    }
}

