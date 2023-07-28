import java.util.Scanner;
public class PenniesForPay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days worked: ");
        int days = sc.nextInt();
        while(days < 1){
            System.out.print("Please enter valid days number: ");
            days = sc.nextInt();
        }
        int sum=0;
        for(int i=1; i<=days; i++){
            System.out.println("Salary for day " + i + " : " + i +"$");
            sum = sum+i;
        }
        System.out.println("\n Total pay: " + sum +"$");

    }
}
