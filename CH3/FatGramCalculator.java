import java.util.Scanner;

public class FatGramCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of calories: ");
        double totalCalories = sc.nextDouble();
        System.out.print("Enter fat grams: ");
        double fatGrams = sc.nextDouble();

        double caloriesFromFat = fatGrams * 9;
        double fatCaloriePercentage = (caloriesFromFat/totalCalories) * 100;

        System.out.printf("Calories Percentage from Fat is: %.2f \n", fatCaloriePercentage);
        if(fatCaloriePercentage < 30)
            System.out.println("food is low in fat");




    }
}
