import java.util.Scanner;
public class PlantingGrapevines {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of row in feet: ");
        double rowLength  = sc.nextDouble();
        System.out.print("Enter the amount of space: ");
        double spaceAmount = sc.nextDouble();
        System.out.print("Enter the amount of space between vines: ");
        double spaceBetweenVines = sc.nextDouble();

        double numberOfGrapeVines = (rowLength - 2*(spaceAmount))/spaceBetweenVines;

        System.out.println("Number of grapevines that will fit: " + numberOfGrapeVines);

    }
}
