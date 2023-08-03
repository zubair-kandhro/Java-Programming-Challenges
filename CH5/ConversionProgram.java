package CH5;
import java.util.*;
public class ConversionProgram {

    public void showKilometers(int meters){
        double kilometers = meters * 0.001;
        System.out.println(meters + " meters converted into kilometers: "  + kilometers + " km");
    }

    public void showInches(int meters){
        double inches = meters * 39.37;
        System.out.println(meters + " meters converted into inches: "  + inches + " inches");
    }

    public void showFeet(int meters){
        double feet = meters * 3.281;
        System.out.println(meters + " meters converted into feet: "  + feet + " feet");
    }

    public void menu(){
        System.out.println("\nPlease select the conversion menu: ");
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }


    public static void main(String[] args){
        ConversionProgram p = new ConversionProgram();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a distance in meters: ");
        int distanceInMeters = sc.nextInt();

        int selection = 0;
        while(selection != 4) {
            p.menu();
            System.out.print("\nEnter your choice: ");
            selection = sc.nextInt();

            if (selection == 1)
                p.showKilometers(distanceInMeters);
            else if (selection == 2)
                p.showInches(distanceInMeters);
            else if (selection == 3)
                p.showFeet(distanceInMeters);
            else if (selection == 4)
                System.out.print("Bye!");
            else
                System.out.println("Enter valid choice");
        }

    }
}
