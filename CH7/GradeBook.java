package CH7;

import java.util.Scanner;

public class GradeBook {
    String[] names = new String[5];
    char[] grade = {'A', 'B', 'C', 'D', 'F'};

    double[] test1 = new double[4];
    double[] test2 = new double[4];
    double[] test3 = new double[4];
    double[] test4 = new double[4];

    public void studentsName(){
        System.out.println("Students Names: ");
        for(int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }
    }

    public void averageScore(){
        double[] sum = new double[5];
        for(int i=0; i<names.length; i++){
            for(int j=0; j<4; j++) {
                sum[i] = test1[j] + test2[j] + test3[j] + test4[j];
            }

        }
        for(int i=0; i<sum.length; i++){
            System.out.print(sum[i] + " ");
        }
    }
    public static void main(String[] args){
        GradeBook g = new GradeBook();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Five Students Names: ");
        for(int i=0; i<g.names.length; i++){
            g.names[i] = sc.next();
        }

        for(int i=0; i<g.names.length; i++){
            for(int j=0; j<4; j++){
                System.out.print("Enter " + g.names[i] + "'s " + "test" + (j+1) + " score: ");
                g.test1[j] = sc.nextDouble();
            }
            System.out.println();
        }

        g.studentsName();
        g.averageScore();






    }
}
