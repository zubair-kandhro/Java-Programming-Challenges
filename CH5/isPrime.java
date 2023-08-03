import java.util.Scanner;

public class isPrime {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to check if it's a prime number: ");
        int number = scanner.nextInt();

        boolean isPrime = isPrime(number);

        for(int i=0; i<100; i++){
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        }}
    }
}

