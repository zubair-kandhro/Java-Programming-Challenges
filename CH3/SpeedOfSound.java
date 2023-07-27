import java.util.Scanner;

public class SpeedOfSound {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter medium: 'air', 'water', and 'steel': ");
        String medium = sc.next();
        System.out.print("Enter distance that sound wave travel: ");
        double distance = sc.nextDouble();
        double airTime, waterTime, steelTime;

        if(medium.equals("air")){
            airTime = distance/1100;
            System.out.printf("The amount of time it will take: %.2f", airTime);
        }
        if(medium.equals("water")){
            airTime = distance/4900;
            System.out.printf("The amount of time it will take: %.2f", airTime);
        }
        if(medium.equals("steel")){
            airTime = distance/16400;
            System.out.printf("The amount of time it will take: %.2f", airTime);
        }
    }
}
