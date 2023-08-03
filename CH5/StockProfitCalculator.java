package CH5;

import java.util.Scanner;

public class StockProfitCalculator {

    public static double calculateProfitLoss(int numberOfShares, double purchasePricePerShare, double purchaseCommissionPaid, double salePricePerShare, double saleCommissionPaid) {
        double totalPurchaseCost = (numberOfShares * purchasePricePerShare) + purchaseCommissionPaid;
        double totalSaleRevenue = (numberOfShares * salePricePerShare) - saleCommissionPaid;
        double profitLoss = totalSaleRevenue - totalPurchaseCost;
        return profitLoss;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of shares: ");
        int numberOfShares = scanner.nextInt();

        System.out.print("Enter the purchase price per share: ");
        double purchasePricePerShare = scanner.nextDouble();

        System.out.print("Enter the purchase commission paid: ");
        double purchaseCommissionPaid = scanner.nextDouble();

        System.out.print("Enter the sale price per share: ");
        double salePricePerShare = scanner.nextDouble();

        System.out.print("Enter the sale commission paid: ");
        double saleCommissionPaid = scanner.nextDouble();

        double profitLoss = calculateProfitLoss(numberOfShares, purchasePricePerShare, purchaseCommissionPaid, salePricePerShare, saleCommissionPaid);

        if (profitLoss > 0) {
            System.out.printf("The sale resulted in a profit of $%.2f.%n", profitLoss);
        } else if (profitLoss < 0) {
            System.out.printf("The sale resulted in a loss of $%.2f.%n", Math.abs(profitLoss));
        } else {
            System.out.println("The sale resulted in neither profit nor loss.");
        }
    }
}

