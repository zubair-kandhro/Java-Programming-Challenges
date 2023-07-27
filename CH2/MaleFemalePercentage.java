import java.util.Scanner;
public class MaleFemalePercentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of males: ");
        double males = sc.nextInt();
        System.out.print("Enter number of females: ");
        double females = sc.nextInt();

        double total = males + females;
        double malePercentage = males/total;
        double femalePercentage = females/total;

        System.out.println("Percentage of males: " + (malePercentage*100) + "%");
        System.out.println("Percentage of females: " + (femalePercentage*100) + "%");
    }
}
