import java.util.Scanner;
public class IngredientAdjuster {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double sugarForOneCookie = 1.5/48;
        double butterForOneCookie = 1.0/48.0;
        double floorForOneCookie = 2.75/48;

        System.out.print("How many cookies you want to make: ");
        double numberOfCookies = sc.nextDouble();
        double cupOfSugar = numberOfCookies * sugarForOneCookie;
        double cupOfButter = numberOfCookies * butterForOneCookie;
        double cupOfFloor = numberOfCookies * floorForOneCookie;

        System.out.println(cupOfSugar + " cups of sugar needed");
        System.out.println(cupOfButter + " cups of butter needed");
        System.out.println(cupOfFloor + " cups of floor needed");
    }
}
