public class StockCommission {
    public static void main(String[] args){

        double shares = 600;
        double perSharePrice = 21.77;
        double amountPaid = shares * perSharePrice;
        double commissionAmount = amountPaid * 0.02;
        double totalAmount = amountPaid + commissionAmount;

        System.out.println("The amount paid for the stock alone: " + amountPaid );
        System.out.println("The amount of the commission: " + commissionAmount);
        System.out.println("The total amount paid: " + totalAmount);

    }
}
