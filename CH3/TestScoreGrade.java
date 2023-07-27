import java.util.Scanner;
public class TestScoreGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter test#1 score: ");
        double score1 = sc.nextDouble();
        System.out.print("Enter test#2 score: ");
        double score2 = sc.nextDouble();
        System.out.print("Enter test#3 score: ");
        double score3 = sc.nextDouble();

        double average = (score1 + score2 + score3)/3;

        System.out.println("The average score is: " + average);

        if(average < 60)
            System.out.println("The grade is: 'F'");
        else if(average <70)
            System.out.println("The grade is: 'D'");
        else if(average <80)
            System.out.println("The grade is: 'C'");
        else if(average <90)
            System.out.println("The grade is: 'B'");
        else if(average <=100)
            System.out.println("The grade is: 'A'");
        else
            System.out.println("It is not a valid number");

    }
}
