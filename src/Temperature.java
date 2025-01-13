
public class Temperature {
	
	double convertCelsiusToFahrenheit(double temperature) {
		return (temperature * 9/5 + 32);
	}
	
	double convertFahrenheitToCelsius(double temperature) {
		return ((temperature - 32) * 5)/9;
	}
}
