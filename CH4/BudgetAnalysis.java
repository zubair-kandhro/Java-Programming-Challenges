import java.util.Scanner;
public class BudgetAnalysis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount budgeted for month: ");
        int budgetAmount = sc.nextInt();
        int expenses, total=0;
        do{
            System.out.print("Enter your each expenses for month (enter 0 to end): ");
            expenses = sc.nextInt();
            total = total + expenses;
        } while(expenses != 0);
        if(total > budgetAmount)
            System.out.println("User is over budget");
        else
            System.out.println("User is under budget");
    }
}
