import java.util.Scanner;
public class CookieCalorie {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cookiesBag = 40;
        double totalServings = 10;
        int serving = 300;

        System.out.print("Enter the number of cookies you ate: ");
        int numberOfCookies = sc.nextInt();

        double totalCalories = (numberOfCookies/cookiesBag) * totalServings * serving;
        System.out.println("Total calories consumed: " + totalCalories);
    }
}
