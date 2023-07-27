import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        int seconds = sc.nextInt();
        int minutes, hours, days;
        if(seconds >= 86400) {
            days = seconds / 86400;
            System.out.println("Number of days: " + days);
        }
        else if(seconds >= 3600) {
            hours = seconds / 3600;
            System.out.println("Number of hours: " + hours);
        }
        else if(seconds >= 60) {
            minutes = seconds / 60;
            System.out.println("Number of minutes: " + minutes);
        }

    }
}
