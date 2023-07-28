import java.util.Scanner;
public class HotelOccupancy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of floors in the hotel: ");
        int floors = sc.nextInt();
        while(floors < 1){
            System.out.print("Please enter valid number of floor: ");
            floors = sc.nextInt();
        }
        int totalRooms=0, totalOccupiedRooms=0;

        for(int i=1; i<=floors; i++){
            System.out.print("Enter number of rooms for floor "+i+": ");
            int rooms = sc.nextInt();
            while(rooms < 10){
                System.out.print("Do not enter number less than 10, try more: ");
                rooms = sc.nextInt();
            }
            totalRooms = totalRooms + rooms;
            System.out.print("Enter number of occupied room for floor "+i+": ");
            int occupiedRooms = sc.nextInt();
            totalOccupiedRooms = totalOccupiedRooms + occupiedRooms;
        }

        double occupancyRate = (double) totalOccupiedRooms / totalRooms;
        System.out.println("\nTotal number of rooms hotel has: "+ totalRooms);
        System.out.println("Total number of occupied rooms: "+ totalOccupiedRooms);
        System.out.println("number of vacant rooms: "+ (totalRooms - totalOccupiedRooms));
        System.out.printf("Occupancy rate: %.2f",occupancyRate);
    }
}
