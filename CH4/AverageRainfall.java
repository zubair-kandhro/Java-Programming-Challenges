import java.util.Scanner;
public class AverageRainfall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        while(years < 1){
            System.out.print("Please enter greater than 1 years: ");
            years = sc.nextInt();
        }
        int numberOfMonth=0;
        double inchesOfRainfall, totalInchesRainfall=0, averageRainfallPerMonth;
        for(int i=1; i<=years; i++){
            for(int j=1; j<=12; j++){
                System.out.print("Enter the inches of rainfall for month "+j+": ");
                inchesOfRainfall = sc.nextDouble();
                while(inchesOfRainfall < 0){
                    System.out.print("Please do not enter negative numbers, try another: ");
                    inchesOfRainfall = sc.nextDouble();
                }
                numberOfMonth++;
                totalInchesRainfall = totalInchesRainfall + inchesOfRainfall;
            }
        }
        averageRainfallPerMonth = totalInchesRainfall/numberOfMonth;
        System.out.println("Number of month: " + numberOfMonth);
        System.out.println("Total inches of rainfall: " + totalInchesRainfall);
        System.out.println("Average rainfall per month: " + averageRainfallPerMonth);
    }
}
