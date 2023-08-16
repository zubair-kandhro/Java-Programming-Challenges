package CH7;

import java.util.Scanner;

public class DriverExam {
    char[] correctKey = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'D', 'D', 'A'};
    String[] sAnswers = new String[20];
    int correct=0;
    public boolean passed(){
        boolean bool = true;
        for(int i=0; i<20; i++){
            if(correctKey[i] == sAnswers[i].charAt(0)){
                correct++;
            }
        }
        if(correct >= 15){
            return bool;
        }
        else
            bool = false;

        return bool;
    }

    public int totalCorrect(){
        return correct;
    }

    public int totalIncorrect(){
        return 20-correct;
    }

    public static void main(String[] args){
        DriverExam e = new DriverExam();
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<20; i++){
            System.out.print("Enter Q:"+(i+1)+" Answer: ");
            e.sAnswers[i] = sc.next();
        }

        if(e.passed()){
            System.out.println("\nStudent passed the exam");
        }
        else{
            System.out.println("\nStudent failed the exam");
        }

        System.out.println("Total correct answers: " + e.totalCorrect());
        System.out.println("Total Incorrect answers: " + e.totalIncorrect());
    }
}
