package CH5;

public class TestAverageGrade {

    public double calcAverage(int score1, int score2, int score3, int score4, int score5){
        double average = (score1 + score2 + score3 + score3 + score4)/5.0;
        return average;
    }

    public char determineGrade(int score){
        char grade;
        if(score >= 90 && score < 100)
            grade = 'A';
        else if (score >= 80 && score < 89)
            grade = 'B';
        else if (score >= 70 && score < 79)
            grade = 'C';
        else if (score >= 60 && score < 69)
            grade = 'D';
        else if (score < 60)
            grade = 'F';
        else {
            System.out.println("Enter valid score");
            grade = ' ';
        }
        return grade;

    }
    public static void main(String[] args){

        TestAverageGrade t = new TestAverageGrade();

        System.out.println("Average: " + t.calcAverage(80, 98, 78, 65, 84));
        System.out.println("Grade: " + t.determineGrade(87));

    }
}
