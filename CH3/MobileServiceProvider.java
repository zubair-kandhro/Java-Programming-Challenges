import java.util.Scanner;

public class MobileServiceProvider {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter letter of Package i.e 'A', 'B', or 'C': ");
        String input = sc.next();
        char letter = input.charAt(0);
        System.out.print("Enter number of minutes used: ");
        int minutes = sc.nextInt();

        if(letter == 'A'){
            if(minutes <= 450)
                System.out.println("Total charges: " + 39.99);
            else{
                int addMinutes = minutes - 450;
                double extraCharges = addMinutes * 0.45;
                double totalCharges = 39.99 + extraCharges;
                System.out.printf("Total charges: %.2f$",totalCharges);
            }

        }
        if(letter == 'B'){
            if(minutes <= 900)
                System.out.println("Total charges: " + 59.99);
            else{
                int addMinutes = minutes - 900;
                double extraCharges = addMinutes * 0.40;
                double totalCharges = 59.99 + extraCharges;
                System.out.printf("Total charges: %.2f$",totalCharges);
            }

        }
        if(letter == 'C')
                System.out.println("Total charges: " + 69.99+"$");

        }

    }

