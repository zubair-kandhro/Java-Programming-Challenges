package Ch8;

import java.util.prefs.BackingStoreException;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public BankAccount(BankAccount other){
        balance = other.balance;
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args){
        BankAccount account1 = new BankAccount(1000);

        BankAccount account2 = new BankAccount(account1);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

    }
}
