package CH6;

import java.util.Scanner;

public class TestScores {
    int score1, score2, score3;

    TestScores(int score1 ,int score2, int score3){
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public int getScore1(){
        return score1;
    }
    public int getScore2(){
        return score2;
    }
    public int getScore3(){
        return score3;
    }
    public void setScore1(int score1){
        this.score1 = score1;
    }
    public void setScore2(int score2){
        this.score2 = score2;
    }
    public void setScore3(int score3){
        this.score3 = score3;
    }

    public double average(){
        return (score1 + score2 + score3)/3.0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three test scores: ");
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();

        TestScores t = new TestScores(score1, score2, score3);

        System.out.println("Average Score: " + t.average());






    }
}
