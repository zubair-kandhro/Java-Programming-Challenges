import java.util.Scanner;

public class ShippingCharges {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight of package: ");
        double weight = sc.nextDouble();
        if(weight <= 2)
            System.out.println("Shipping Charges: $1.10");
        else if (weight > 2 && weight <=6)
            System.out.println("Shipping Charges: $2.20");
        else if (weight > 6 && weight <=10)
            System.out.println("Shipping Charges: $3.70");
        else if (weight > 10)
            System.out.println("Shipping Charges: $3.80");
    }
}
