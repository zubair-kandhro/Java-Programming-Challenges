import java.util.Scanner;
import java.util.Random;
public class DiceGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int computerDiceCount=0, userDiceCount=0;
        for(int i=0; i<10; i++){
            int computerDice = rand.nextInt(6)+1;
            int userDice = rand.nextInt(6)+1;
            if(computerDice > userDice) {
                System.out.println("Computer wins!");
                computerDiceCount = computerDiceCount + 1;
            }
            else if(userDice > computerDice) {
                System.out.println("User wins!");
                userDiceCount = userDiceCount + 1;
            }
            else
                System.out.println("There is no winner ");
        }

        if(computerDiceCount > userDiceCount)
            System.out.println("\n Grand winner is the Computer");
        else
            System.out.println("\n Grand winner is User");
    }
}
