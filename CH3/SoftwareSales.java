import java.util.Scanner;
public class SoftwareSales {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of packages purchased: ");
        int numberOfPackages = sc.nextInt();
        int packagePrice = 99;
        double amount, totalAmount, discountAmount;
        if(numberOfPackages < 10){
            totalAmount = numberOfPackages * packagePrice;
            System.out.println("Total amount of purchase: " + totalAmount);
        }
        else if (numberOfPackages < 20) {
            amount = numberOfPackages * packagePrice;
            discountAmount = amount * 0.20;
            totalAmount =  amount - discountAmount;
            System.out.println("Amount of discount is: " + discountAmount);
            System.out.println("Total amount of purchase after discount: " + totalAmount);
        }
        else if (numberOfPackages < 50) {
            amount = numberOfPackages * packagePrice;
            discountAmount = amount * 0.30;
            totalAmount =  amount - discountAmount;
            System.out.println("Amount of discount is: " + discountAmount);
            System.out.println("Total amount of purchase after discount: " + totalAmount);
        }
        else if (numberOfPackages < 100) {
            amount = numberOfPackages * packagePrice;
            discountAmount = amount * 0.40;
            totalAmount =  amount - discountAmount;
            System.out.println("Amount of discount is: " + discountAmount);
            System.out.println("Total amount of purchase after discount: " + totalAmount);
        }
        else if (numberOfPackages >= 100) {
            amount = numberOfPackages * packagePrice;
            discountAmount = amount * 0.50;
            totalAmount =  amount - discountAmount;
            System.out.println("Amount of discount is: " + discountAmount);
            System.out.println("Total amount of purchase after discount: " + totalAmount);
        }

    }
}
