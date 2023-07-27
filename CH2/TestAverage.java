import java.sql.SQLOutput;
import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Test1 Score: ");
        int test1 = sc.nextInt();

        System.out.print("Enter Test2 Score: ");
        int test2 = sc.nextInt();

        System.out.print("Enter Test3 Score: ");
        int test3 = sc.nextInt();

        System.out.println("Test1 score is: " + test1);
        System.out.println("Test2 score is: " + test2);
        System.out.println("Test3 score is: " + test3);

        int average = (test1 + test2 + test3)/3;

        System.out.println("The Average test score is: " + average);

    }
}
