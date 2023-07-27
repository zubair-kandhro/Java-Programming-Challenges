import java.util.Scanner;
public class MassAndWeight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an object's mass: ");
        double mass = sc.nextDouble();

        double weight = mass * 9.8;

        if(weight > 1000)
            System.out.println("Object is too heavy");
        else if(weight < 10)
            System.out.println("Object is too light");
    }
}
