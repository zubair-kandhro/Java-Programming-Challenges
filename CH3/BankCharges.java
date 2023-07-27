import java.util.Scanner;

public class BankCharges {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of checks written for month: ");
        int checkNumbers = sc.nextInt();
        int baseFee = 10;
        if(checkNumbers < 20){
            double checkFees = checkNumbers * 0.10;
            double bill1 = baseFee + checkFees;
            System.out.printf("Bill: %.2f", bill1);
        }
        else if(checkNumbers >= 20 && checkNumbers < 40){
            checkNumbers = checkNumbers - 19;
            double checkFees = (19 * 0.10 ) + (checkNumbers * 0.08);
            double bill2 = baseFee + checkFees;
            System.out.printf("Bill: %.2f", bill2);
        }
        else if(checkNumbers >= 40 && checkNumbers < 60){
            checkNumbers = checkNumbers - 39;
            double checkFees = (19 * 0.10 ) + (20 * 0.08) + (checkNumbers * 0.06);
            double bill3 = baseFee + checkFees;
            System.out.printf("Bill: %.2f", bill3);
        }
        else if(checkNumbers >= 60){
            checkNumbers = checkNumbers - 59;
            double checkFees = (19 * 0.10 ) + (20 * 0.08) + (20 * 0.06) + (checkNumbers * 0.04);
            double bill4 = baseFee + checkFees;
            System.out.printf("Bill: %.2f", bill4);
        }

    }
}
