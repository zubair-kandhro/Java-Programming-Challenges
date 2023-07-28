import java.util.Scanner;
public class Population {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Starting size of population: ");
        int population = sc.nextInt();
        while(population <2 ){
            System.out.print("Enter more than 2 starting size: ");
            population = sc.nextInt();
        }
        System.out.print("Enter daily population increase(in percentage): ");
        double percentage = sc.nextDouble();
        while(percentage < 0){
            System.out.print("please enter positive percentage: ");
            percentage = sc.nextDouble();
        }
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();
        while (days < 1){
            System.out.print("Enter more than 0 days: ");
            days = sc.nextInt();
        }

        double numberOfPercentage = population * (percentage/100);

        double sizeOfPopulation = (population + numberOfPercentage) * days;

        System.out.println("Size of population: " + sizeOfPopulation);

    }
}
