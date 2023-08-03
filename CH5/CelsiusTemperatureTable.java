package CH5;

public class CelsiusTemperatureTable {

    public double celsius(double fahrenheit){
        double C = 5.0/9 * (fahrenheit - 32);
        return C;
    }
    public static void main(String[] args){
        CelsiusTemperatureTable cel = new CelsiusTemperatureTable();

        System.out.println("Fahrenheit      Celsius");
        for(int i=0; i<=20; i++) {
            System.out.printf("   " + i + "           %.2f C",cel.celsius(i));
            System.out.println();
        }
    }
}
