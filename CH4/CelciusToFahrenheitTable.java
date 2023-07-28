public class CelciusToFahrenheitTable {
    public static void main(String[] args) {
        System.out.println("Celsius  Fahrenheit");
        System.out.println("-------------------");
        for (int celsius = 0; celsius <= 20; celsius++) {
            double fahrenheit = (celsius * 9 / 5.0) + 32;
            System.out.printf("%2d       %.2f%n", celsius, fahrenheit);
        }
    }
}