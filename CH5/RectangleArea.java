package CH5;
import java.util.*;
public class RectangleArea {
    public double getLength(){
        System.out.print("Enter the rectangle's length: ");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        return length;
    }
    public double getWidth(){
        System.out.print("Enter the rectangle's width: ");
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        return width;
    }
    public double getArea(double length, double width){
        return length * width;
    }
    public void displayData(double length, double width, double area){
        System.out.println("Rectangle's length: "+ length);
        System.out.println("Rectangle's width: "+ width);
        System.out.println("Rectangle's Area: "+ area);
    }
    public static void main(String[] args){
        RectangleArea box = new RectangleArea();

        double length = box.getLength();
        double width = box.getWidth();
        double area = box.getArea(length, width);

        box.displayData(length, width, area);

    }
}
