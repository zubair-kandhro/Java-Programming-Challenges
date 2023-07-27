import java.util.Scanner;
public class SalesTax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Amount of Purchase: ");
        double amountOfPurchase  = sc.nextDouble();

        double stateSalesTax = amountOfPurchase * 0.04;
        double countrySalestax = amountOfPurchase * 0.02;
        double totalSalesTax = stateSalesTax + countrySalestax;
        double totalSale = amountOfPurchase + totalSalesTax;

        System.out.println("Amount of Purchase: " + amountOfPurchase);
        System.out.println("State sales tax: " + stateSalesTax);
        System.out.println("Country sales tax: " + countrySalestax);
        System.out.println("Total sales tax: " + totalSalesTax);
        System.out.println("Total of the sale: " + totalSale);
    }
}
