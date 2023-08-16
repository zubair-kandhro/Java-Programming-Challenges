package CH7;
import java.util.Scanner;

public class Payroll {
    private int[] employeeId;
    private int[] hours;
    private double[] payRate;
    private double[] wages;

    public Payroll() {
        employeeId = new int[]{5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
        hours = new int[7];
        payRate = new double[7];
        wages = new double[7];
    }

    public void setHours(int employeeIndex, int hoursWorked) {
        hours[employeeIndex] = hoursWorked;
    }

    public void setPayRate(int employeeIndex, double payRateValue) {
        payRate[employeeIndex] = payRateValue;
    }

    public double calculateGrossWages(int employeeIndex) {
        return hours[employeeIndex] * payRate[employeeIndex];
    }

    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter hours worked for employee " + payroll.employeeId[i] + ": ");
            int hoursWorked = scanner.nextInt();
            payroll.setHours(i, hoursWorked);

            System.out.print("Enter pay rate for employee " + payroll.employeeId[i] + ": ");
            double payRateValue = scanner.nextDouble();
            payroll.setPayRate(i, payRateValue);

            payroll.wages[i] = payroll.calculateGrossWages(i);
            System.out.println();
        }

        System.out.println("\nEmployee Information:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Employee ID: " + payroll.employeeId[i] + ", Gross Wages: $" + payroll.wages[i]);
        }

        scanner.close();
    }
}
