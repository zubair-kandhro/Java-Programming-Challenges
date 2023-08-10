package CH6;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Circle {
    double radius;
    final double PI = 3.14159;

    Circle(double radius){
        this.radius = radius;
    }
    Circle(){
        this.radius = 0.0;
    }

    public void setRadius(double radius){
        this.radius  = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double area(){
        return PI * radius * radius;
    }
    public double diameter(){
        return radius *2;
    }
    public double circumference(){
        return 2 * PI * radius;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        Circle c = new Circle(radius);

        System.out.println("Area of circle: " + c.area());
        System.out.println("Diameter of circle: " + c.diameter());
        System.out.println("Circumference of circle: " + c.circumference());


    }
}
