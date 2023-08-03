package CH5;
import java.util.*;
public class EvenOddCounter {
    static public boolean isEven(int num){
        return num % 2 == 0;

    }
    public static void main(String[] args){
        Random rand = new Random();
        int even=0;
        int odd=0;
        for(int i=0; i<100; i++) {
            if(isEven(rand.nextInt(100))){
                even++;
            }
            else
                odd++;
        }
        System.out.println("Number of Even numbers generated: " + even);
        System.out.println("Number of Odd numbers generated: " +odd);

    }
}
