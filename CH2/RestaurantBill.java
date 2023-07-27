import java.util.Scanner;
public class RestaurantBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the charge for meal: ");
        double mealCharge = sc.nextDouble();
        double mealTax = mealCharge * 0.0675;
        double tipAmount = (mealCharge + mealTax) * 0.20;
        double totalBill = mealCharge + mealTax + tipAmount ;

        System.out.println("Meal charge: " + mealCharge);
        System.out.println("Tax Amount: " + mealTax);
        System.out.println("Tip: " + tipAmount);
        System.out.println("Total bill: " + totalBill);
    }
}
