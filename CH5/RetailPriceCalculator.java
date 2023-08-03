package CH5;
import java.util.*;
public class RetailPriceCalculator {
    public void calculateRetail(double cost, double percentage){

        double total = cost + (cost * (percentage/100));
        System.out.println(total);


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        RetailPriceCalculator calc = new RetailPriceCalculator();

        System.out.print("Enter an item's wholesale cost: ");
        double cost = sc.nextDouble();
        System.out.print("Enter an item's markup percentage: ");
        double percentage = sc.nextDouble();

        calc.calculateRetail(cost, percentage);



    }
}
