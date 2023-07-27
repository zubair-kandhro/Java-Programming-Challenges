import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Is anyone in your party a vegetarian? ");
        String vegetarian = sc.next();
        System.out.print("Is anyone in your party a vegan? ");
        String vegan = sc.next();
        System.out.print("Is anyone in your party gluten-free? ");
        String glutenFree = sc.next();
        System.out.println();

        if(vegetarian.equals("no") && vegan.equals("no") && glutenFree.equals("no")){
            System.out.println("Here are your restaurant choices:");
            System.out.println("Joe’s Gourmet Burgers");
            System.out.println("Main Street Pizza Company");
            System.out.println("Corner Café");
            System.out.println("Mama’s Fine Italian");
            System.out.println("The Chef’s Kitchen");
        }
        else if (vegetarian.equals("no") && vegan.equals("no") && glutenFree.equals("yes")) {
            System.out.println("Here are your restaurant choices:");
            System.out.println("Main Street Pizza Company");
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
        }
        else if(vegetarian.equals("no") && vegan.equals("yes") && glutenFree.equals("no")){
            System.out.println("Here are your restaurant choices:");
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
        }
        else if(vegetarian.equals("no") && vegan.equals("yes") && glutenFree.equals("yes")){
            System.out.println("Here are your restaurant choices:");
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
        }
        else if(vegetarian.equals("yes") && vegan.equals("no") && glutenFree.equals("no")){
            System.out.println("Here are your restaurant choices:");
            System.out.println("Main Street Pizza Company");
            System.out.println("Corner Café");
            System.out.println("Mama’s Fine Italian");
            System.out.println("The Chef’s Kitchen");
        }
        else if(vegetarian.equals("yes") && vegan.equals("yes") && glutenFree.equals("no")){
            System.out.println("Here are your restaurant choices:");
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
        }
        else if(vegetarian.equals("yes") && vegan.equals("no") && glutenFree.equals("yes")){
            System.out.println("Here are your restaurant choices:");
            System.out.println("Main Street Pizza Company");
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
        }
        else if(vegetarian.equals("yes") && vegan.equals("yes") && glutenFree.equals("yes")){
            System.out.println("Here are your restaurant choices:");
            System.out.println("Corner Café");
            System.out.println("The Chef’s Kitchen");
        }

    }
}
