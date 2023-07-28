import java.util.Scanner;
public class DistanceTraveled {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed of vehicle in MPH: ");
        int speed = sc.nextInt();
        while(speed < 0){
            System.out.print("please enter positive number: ");
            speed = sc.nextInt();
        }

        System.out.print("Enter number of hours traveled: ");
        int hours = sc.nextInt();
        while (hours < 1){
            System.out.print("Please enter valid hours number: ");
            hours = sc.nextInt();
        }
        int distance;
            System.out.println("Hour           Distance Traveled");
            System.out.println("--------------------------------");
        for(int i=1; i<=hours; i++){
            distance = i * speed;
            System.out.println(i + "                 " + distance);

        }

    }
}
