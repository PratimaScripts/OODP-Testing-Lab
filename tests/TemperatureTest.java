import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {
 
	@Test
	void testCelsiusToFahrenheit() {
		Temperature temperature = new Temperature();		
		assertEquals(89.6,temperature.convertCelsiusToFahrenheit(32), 0.001);
		assertEquals(118.4,temperature.convertCelsiusToFahrenheit(48), 0.001);
		assertEquals(73.4,temperature.convertCelsiusToFahrenheit(23), 0.001);
		assertEquals(96.8,temperature.convertCelsiusToFahrenheit(36), 0.001);
		System.out.println("This method checks the conversion for a range of celsius values");
	}
	
	@Test
	void testFahrenheittoCelsius() {
		Temperature temperature = new Temperature();		
		assertEquals(32.0,temperature.convertFahrenheitToCelsius(89.6), 0.001);
		assertEquals(48.0,temperature.convertFahrenheitToCelsius(118.4), 0.001);
		assertEquals(23.0,temperature.convertFahrenheitToCelsius(73.4), 0.001);
		assertEquals(36.0,temperature.convertFahrenheitToCelsius(96.8), 0.001);
		System.out.println("This method checks the conversion for a range of Fahrenheit values");
	}
}