import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height = sc.nextDouble();

        double BMI = weight * (703/(height * height));
        if(BMI >= 18.5 && BMI <= 25)
            System.out.println("The weight is Optimal: " + BMI);
        else if(BMI < 18.5)
            System.out.println("The wight is Underweight: " + BMI);
        else
            System.out.println("The weight is Overweight: " + BMI);

    }
}
