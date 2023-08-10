import java.util.Scanner;

public class SavingsAccount {
    private double annualInterestRate;
    private double balance;

    public SavingsAccount(double startingBalance) {
        balance = startingBalance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the starting balance: ");
        double startingBalance = scanner.nextDouble();

        System.out.print("Enter the number of months passed since the account was established: ");
        int monthsPassed = scanner.nextInt();

        SavingsAccount savingsAccount = new SavingsAccount(startingBalance);
        savingsAccount.setAnnualInterestRate(annualInterestRate);

        double totalDeposits = 0;
        double totalWithdrawals = 0;

        for (int i = 1; i <= monthsPassed; i++) {
            System.out.print("\nMonth " + i + "\n");
            System.out.print("Enter the amount deposited this month: ");
            double depositAmount = scanner.nextDouble();
            savingsAccount.deposit(depositAmount);
            totalDeposits += depositAmount;

            System.out.print("Enter the amount withdrawn this month: ");
            double withdrawalAmount = scanner.nextDouble();
            savingsAccount.withdraw(withdrawalAmount);
            totalWithdrawals += withdrawalAmount;

            savingsAccount.calculateMonthlyInterest();
        }

        double endingBalance = savingsAccount.getBalance();
        double totalInterestEarned = endingBalance - (startingBalance + totalDeposits - totalWithdrawals);

        System.out.println("\nEnding Balance: $" + endingBalance);
        System.out.println("Total Deposits: $" + totalDeposits);
        System.out.println("Total Withdrawals: $" + totalWithdrawals);
        System.out.println("Total Interest Earned: $" + totalInterestEarned);


    }
}
