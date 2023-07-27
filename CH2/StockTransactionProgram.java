public class StockTransactionProgram {
    public static void main(String[] args){
        double sharePurchased = 1000;
        double paidAmountPerShare = 32.87;
        double amountPaidForStock = sharePurchased * paidAmountPerShare;
        double purchaseCommission = amountPaidForStock * 0.02;

        double sharesSold = 1000;
        double soldAmountPerShare = 33.92;
        double amountReceivedForStock = sharesSold * soldAmountPerShare;
        double soldCommission = amountReceivedForStock * 0.02;

        double profit = (amountReceivedForStock - soldCommission) - (amountPaidForStock - purchaseCommission);

        System.out.println("Joe paid for the stock: " + amountPaidForStock);
        System.out.println("Joe paid amount of commission when he bought: " + purchaseCommission);
        System.out.println("Joe sold the stock: " + amountReceivedForStock);
        System.out.println("Joe paid amount of commission when he sold: " + soldCommission);
        System.out.println("Joe made profit of: " + profit);


    }
}
