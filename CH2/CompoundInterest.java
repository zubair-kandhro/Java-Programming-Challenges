import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal amount deposited into account: ");
        double principalAmount = sc.nextDouble();
        System.out.print("Annaual Interest Rate: ");
        double interestRate = sc.nextDouble();
        System.out.print("Number of times per year that the interest is compounded: ");
        double n = sc.nextDouble();
        System.out.print("The number of years the account will be left to earn interest: ");
        double t = sc.nextDouble();

        double base = (1 + (interestRate/n));
        double exponent = n*t;
        double result  = Math.pow(base, exponent);

        double amountOfMoney = principalAmount * result;

        System.out.println("amount of money in the account after specified number of years: " + amountOfMoney);

    }
}
