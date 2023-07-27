import java.util.Scanner;
public class CircuitBoardProfit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter retail price of circuit board: ");
        int retailPrice = sc.nextInt();

        double profit = retailPrice * 0.4;

        System.out.println("Amount of profit earned: " + profit);
    }
}
