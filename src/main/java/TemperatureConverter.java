import java.util.Scanner;

public class TemperatureConverter {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, fahrenheit);
        input.close();
        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheitInput = input.nextDouble();
        double celsiusOutput = fahrenheitToCelsius(fahrenheitInput);
        System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", fahrenheitInput,celsiusOutput);
        System.out.println("Enter temperature in Kelvin: ");
        double kelvinInput = input.nextDouble();
        double celsiusFromKelvin = kelvinToCelsius(kelvinInput);
        System.out.printf("%.2f Kelvin is %.2f Celsius%n", kelvinInput, celsiusFromKelvin);
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }
}
