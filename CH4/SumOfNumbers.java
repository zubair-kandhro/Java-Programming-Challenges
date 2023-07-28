import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive nonzero integer to get sum: ");
        int number =  sc.nextInt();
        int sum=0;
        while (number <= 0){
            System.out.print("Please enter nonzero positive integer: ");
            number = sc.nextInt();
        }
        for(int i=1; i<=number; i++){
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);


    }
}
