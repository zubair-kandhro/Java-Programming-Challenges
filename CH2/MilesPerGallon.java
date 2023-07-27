import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of miles driven: ");
        double numberOfMiles = sc.nextDouble();

        System.out.print("Enter number of gallons of gas used: ");
        double numberOfGallons = sc.nextDouble();

        double milesPerGallon = numberOfMiles / numberOfGallons;

        System.out.printf("Car's miles-per-gallon: %.2f", milesPerGallon);
    }
}
