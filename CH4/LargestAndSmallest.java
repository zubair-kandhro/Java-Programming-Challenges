import java.util.Scanner;
public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a series of integers (enter -99 to end): ");
        int number, smallest=0, largest=0;
        do {
            number = sc.nextInt();

            if (number != -99) {
                if (number < smallest || smallest ==0) {
                    smallest = number;
                }

                if (number > largest) {
                    largest = number;
                }
            }
        } while (number != -99);
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
