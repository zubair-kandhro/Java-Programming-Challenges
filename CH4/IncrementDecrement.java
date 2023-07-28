public class IncrementDecrement {
    public static void main(String[] args){

        int number = 1;
        while (number <= 5) // This semicolon is an ERROR!
        {
            System.out.println("Hello");
            number++;
        }
        System.out.println("hi");


    }
}
