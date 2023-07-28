import java.util.Scanner;
import java.util.Random;
public class ESPGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String color="";

        int count=0;
        for(int i=0; i<10; i++) {
            int randomNumber = rand.nextInt(5);
            switch (randomNumber){
                case 0:
                    color = "red";
                    break;
                case 1:
                    color = "green";
                    break;
                case 2:
                    color = "blue";
                    break;
                case 3:
                    color = "orange";
                    break;
                case 4:
                    color = "yellow";
                    break;
            }
            System.out.print("Enter the color that computer has selected: ");
            String guessColor = sc.next();
            System.out.println("Randomly selected color: " + color);
            if(guessColor.equals(color))
                count++;
        }
        System.out.println("number of times user correctly guessed the color: " + count);
    }
}
