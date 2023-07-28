import java.util.Scanner;
import java.util.Random;
public class RandomNumberGuessEnhance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        System.out.println(randomNumber);
        System.out.print("Guess what the random number is: ");
        int guessNumber = sc.nextInt();

        int count=0;
        if(randomNumber == guessNumber)
            System.out.println("Congrates you got");

        while (guessNumber > randomNumber) {
            System.out.print("Too high, try again: ");
            guessNumber = sc.nextInt();
            count = count+1;
            while (guessNumber < randomNumber) {
                System.out.print("Too low, try again: ");
                guessNumber = sc.nextInt();
                count = count+1;
            }
            if(guessNumber == randomNumber)
                System.out.println("Congrates you got");

        }
        while (guessNumber < randomNumber) {
            System.out.print("Too low, try again: ");
            guessNumber = sc.nextInt();
            count = count+1;
            while (guessNumber > randomNumber) {
                System.out.print("Too high, try again: ");
                guessNumber = sc.nextInt();
                count = count+1;
            }
            if(guessNumber == randomNumber)
                System.out.println("Congrates you got");
        }
        System.out.println("number of guesses: "+count);
    }
}
