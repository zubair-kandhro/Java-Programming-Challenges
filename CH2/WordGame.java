import java.util.Scanner;
public class WordGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter the name of city: ");
        String city = sc.next();
        System.out.print("Enter the name of college: ");
        String college = sc.next();
        System.out.print("Enter your profession: ");
        String profession = sc.next();
        System.out.print("Enter type of animal: ");
        String animalType = sc.next();
        System.out.print("Enter pet's name: ");
        String petName = sc.next();

        System.out.println("There once was a person named " + name + " who lived in "+ city + ". \n" +
                            "At the age of "+ age + ", "+name+" went to college at "+college+ " graduated and went \n" +
                            " to work as a "+profession+ ". Then, "+name+" adopted a "+animalType+ " named \n" +
                            petName + ". They both lived happily ever after!");

    }
}
