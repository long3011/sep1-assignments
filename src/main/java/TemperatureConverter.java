public class TemperatureConverter {

    static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = celsiusToFahrenheit(celsius);
        double kelvin = fahrenheitToCelsius(fahrenheit) + 273.15;

        System.out.println(celsius + " °C is " + fahrenheit + " °F");
        System.out.println(fahrenheit + " °F is " + fahrenheitToCelsius(fahrenheit) + " °C");
        System.out.println(kelvin + " K is " + kelvinToCelsius(kelvin) + " °C");

        double extremeTemp = -45.0;
        System.out.println(extremeTemp + " °C is an extreme temperature: " + isExtremeTemperature(extremeTemp));
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
