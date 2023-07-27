import java.util.Scanner;
public class MagicDates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day, month, year;
        System.out.print("Enter a month in numeric form: ");
        month = sc.nextInt();
        System.out.print("Enter a day in numeric form: ");
        day = sc.nextInt();
        System.out.print("Enter a year in two-digit: ");
        year = sc.nextInt();

        int magicDate = month * day;
        if(magicDate == year)
            System.out.println("The date is magic");
        else
            System.out.println("Date is not magic");

    }
}
