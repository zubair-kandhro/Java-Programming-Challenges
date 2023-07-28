import java.util.Scanner;
import java.util.Random;
public class SlotMachineSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String word = "";
        int count = 0, totalAmountMoney=0, totalAmountWon=0;

        boolean playAgain = true;
        while (playAgain) {

        System.out.print("Enter amount of money you want to enter into slot machine: ");
        int money = sc.nextInt();
        totalAmountMoney = totalAmountMoney + money;
        System.out.println("Select a word from following list: ");
        System.out.print("Cherries, Oranges, Plums, Bells, Melons, Bars: ");
        String input = sc.next();

            for (int i = 0; i < 3; i++) {
                int randomNumber = rand.nextInt(6);

                switch (randomNumber) {
                    case 0:
                        word = "Cherries";
                        break;
                    case 1:
                        word = "Orange";
                        break;
                    case 2:
                        word = "Plums";
                        break;
                    case 3:
                        word = "Bells";
                        break;
                    case 4:
                        word = "Melons";
                        break;
                    case 5:
                        word = "Bars";
                        break;
                }
                System.out.print(word + " ");
                if (input.equals(word))
                    count++;
            }
            if (count == 0)
                System.out.println("\nYou have won 0$");
            else if (count == 1)
                System.out.println("\nYou have won nothing");
            else if (count == 2) {
                System.out.println("\nYou have won 2 times " + 2 * money + "$");
                    totalAmountWon = money*2;
            }
            else if (count == 3) {
                System.out.println("\nYou have won 3 times" + 3 * money + "$");
                totalAmountWon = money*3;
            }

            System.out.print("\nDo you want to play again (yes/no): ");
            String play = sc.next();
            if(play.equalsIgnoreCase("yes"))
                count =0;
            else {
                playAgain = false;
                System.out.println("Total amount of money entered into slot machine: "+ totalAmountMoney);
                System.out.println("Total amount of money entered into slot machine: "+ totalAmountWon);
            }

        }
}



    }







