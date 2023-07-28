import java.util.Scanner;
public class SquareDisplay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter positive integer no greater than 15: ");
        int input = sc.nextInt();
        while(input < 0 || input > 15){
            System.out.print("Please enter positive integer no greater than 15: ");
            input = sc.nextInt();
        }

        for(int i=0; i<input; i++){
            for(int j=0; j<input; j++){
                System.out.print("X");
            }
            System.out.println();
        }

    }
}
