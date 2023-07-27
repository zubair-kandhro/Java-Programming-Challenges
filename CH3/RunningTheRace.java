import java.util.Scanner;

public class RunningTheRace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter names of three runners: ");
        String name1 = sc.next();
        String name2 = sc.next();
        String name3 = sc.next();

        System.out.print("Enter the race finish time in mins: ");
        int time1 = sc.nextInt();
        int time2 = sc.nextInt();
        int time3 = sc.nextInt();

        if(time1 > time2 && time2 > time3){
            System.out.println(name1);
            System.out.println(name2);
            System.out.println(name3);
        }
        else if(time2 > time1 && time1 > time3){
            System.out.println(name2);
            System.out.println(name1);
            System.out.println(name3);
        }
        else if(time3 > time1 && time1 > time2){
            System.out.println(name3);
            System.out.println(name1);
            System.out.println(name3);
        }

    }
}
