import java.util.Scanner;

public class WifiDiagnostic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Reboot the computer and try to connect.");
        System.out.print("Did that fix the problem? ");
        String input = sc.next();

        if (input.equals("Yes") || input.equals("yes"))
            return;

        else {
            System.out.println("Reboot the router and try to connect.");
            System.out.print("Did that fix the problem? ");
            String input1 = sc.next();
            if (input1.equals("Yes") || input1.equals("yes"))
                return;
            else {
                System.out.println("Make sure the cables between the router and modem are plugged in firmly.");
                System.out.print("Did that fix the problem? ");
                String input2 = sc.next();
                if (input2.equals("Yes") || input2.equals("yes"))
                    return;
                else {
                    System.out.println("Move the router to a new location and try to connect.");
                    System.out.print("Did that fix the problem? ");
                    String input3 = sc.next();
                    if (input3.equals("Yes") || input3.equals("yes"))
                        return;
                    else {
                        System.out.println("Get a new router.");
                    }

                }
            }
        }
    }
}


