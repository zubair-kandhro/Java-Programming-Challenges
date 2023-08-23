package Ch8;

public class Area{
    public static void area(double radius){
        System.out.printf("The area of circle is: %.2f", Math.PI * radius * radius);
    }

    public static void area(int length, int width){
        System.out.printf("\nThe area of rectangle is: %d", length * width);
    }

    public static void area(double radius, double height){
        System.out.printf("\nThe area of cylinder is: %.2f", Math.PI * radius * radius * height);
    }
    public static void main(String[] args){
        area(2);
        area(2,4);
        area(2.5, 5);
    }
}