import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	static Calculator calculator;
	
	@BeforeAll
	static void setup(){
		calculator = new Calculator();
		System.out.println("Initializing the Calculator Object/Instance");
	}
	
	@AfterAll
	static void atTheEnd() {
		System.out.println("Runs at the very end.");
	}
	
	@BeforeEach
	void runsBeforeEachTestMethod() {
		System.out.println("Runs before each method");
	}
	
	@AfterEach
	void runsAfterEachTestMethod() {
		System.out.println("Runs after each method");
	}

	@Test
	void sumTest() {
		int result = calculator.sum(2,3);
		System.out.println("Sum: " + result);
		assertEquals(5, result);
	}
	
	@Test
	void differenceTest() {
		int result = calculator.difference(6,2);
		System.out.println("Difference: " + result);
		assertEquals(4, result);
	}

	@Disabled
	void multiplyTest() {
		int result = calculator.multiply(6,2);
		System.out.println("Multiply: " + result);
		assertEquals(12, result);
	}
	
	@Test
	public void testSquares() {
		/* expected, actual */
		/* SUT - Standard Unit Test */
		assertEquals(5*5, calculator.square(5));
		assertEquals(25*25, calculator.square(25));
	}

}
