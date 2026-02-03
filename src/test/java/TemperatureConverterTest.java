import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0.0), 0.01);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100.0), 0.01);
    }

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32.0), 0.01);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212.0), 0.01);
    }

    @org.junit.jupiter.api.Test
    void isExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature(-50.0));
        assertTrue(TemperatureConverter.isExtremeTemperature(60.0));
        assertFalse(TemperatureConverter.isExtremeTemperature(20.0));
    }
}