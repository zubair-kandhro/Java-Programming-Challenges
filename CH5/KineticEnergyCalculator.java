package CH5;

import java.util.Scanner;

public class KineticEnergyCalculator {

    public static double kineticEnergy(double mass, double velocity) {
        double kineticEnergy = 0.5 * mass * velocity * velocity;
        return kineticEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the object's mass (in kilograms): ");
        double mass = scanner.nextDouble();

        System.out.print("Enter the object's velocity (in meters per second): ");
        double velocity = scanner.nextDouble();

        double kineticEnergy = kineticEnergy(mass, velocity);

        System.out.printf("The kinetic energy of the object is %.2f joules.%n", kineticEnergy);
    }
}

