package CH6;

import java.util.Scanner;

public class PayRoll {
    String empName;
    int empID;
    double empHourlyRate;
    int hoursWorked;

    PayRoll(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpHourlyRate(double empHourlyRate) {
        this.empHourlyRate = empHourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpID() {
        return empID;
    }

    public double getEmpHourlyRate() {
        return empHourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double grossPay(){
        return hoursWorked * empHourlyRate;
    }

    public void display() {
        System.out.println("\nEmployee Name: " + getEmpName());
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee GrossPay: " + grossPay());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        PayRoll e1 = new PayRoll(name, id);

        System.out.print("Enter the employee1 hourly rate: ");
        e1.setEmpHourlyRate(sc.nextDouble());
        System.out.print("Enter the employee1 hours worked: ");
        e1.setHoursWorked(sc.nextInt());
        e1.display();

    }
}