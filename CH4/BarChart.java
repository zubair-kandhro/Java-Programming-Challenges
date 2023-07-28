import java.util.Scanner;
public class BarChart {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int store1, store2, store3, store4, store5;

        System.out.print("Enter today's sales for store 1: ");
        store1 = sc.nextInt();
        System.out.print("Enter today's sales for store 2: ");
        store2 = sc.nextInt();
        System.out.print("Enter today's sales for store 3: ");
        store3 = sc.nextInt();
        System.out.print("Enter today's sales for store 4: ");
        store4 = sc.nextInt();
        System.out.print("Enter today's sales for store 5: ");
        store5 = sc.nextInt();

        int store1Bar, store2Bar, store3Bar, store4Bar, store5Bar;
        System.out.println("\nSALES BAR CHART");
        System.out.print("Store 1: ");
        printAsterisks(store1);

        System.out.print("Store 2: ");
        printAsterisks(store2);

        System.out.print("Store 3: ");
        printAsterisks(store3);

        System.out.print("Store 4: ");
        printAsterisks(store4);

        System.out.print("Store 5: ");
        printAsterisks(store5);
    }

    // Method to print asterisks based on sales value
    public static void printAsterisks(int sales) {
        int barLength = sales / 100; // Calculate the number of asterisks to display

        for (int j = 0; j < barLength; j++) {
            System.out.print("*");
        }

        System.out.println(); // Move to the next line for the next store
    }
}


