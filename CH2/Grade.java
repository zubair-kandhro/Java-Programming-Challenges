import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage: ");
        double percentage = sc.nextDouble();
        if(percentage >= 90 && percentage <=100){
            System.out.println("Your grade is: A");
        }
        else if (percentage >=80 && percentage <=89) {
            System.out.println("B");
        }
        else if (percentage >=70 && percentage <=79) {
            System.out.println("C");
        }
        else if (percentage >=60 && percentage <=69) {
            System.out.println("D");
        }
        else if (percentage < 60) {
            System.out.println("F");
        }
        else{
            System.out.println("PLease enter valid number");
        }

    }
}
