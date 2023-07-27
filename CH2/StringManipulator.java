import java.util.Scanner;
public class StringManipulator {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of your favorite city: ");
        String favCity = sc.next();

        System.out.println("Number of Characters: " + favCity.length());
        System.out.println("City name in UpperCase: " + favCity.toUpperCase());
        System.out.println("City name in LowerCase: " + favCity.toLowerCase());
        System.out.println("First character in the city name: " + favCity.charAt(0));
    }
}
