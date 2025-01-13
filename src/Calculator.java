/**
 * This is the calculator class
 */
public class Calculator {
	
	//sum
	
	/**
	 * This is the sum method that calculates sum
	 * @param a first parameter user passed
	 * @param b second parameter user passed
	 * @return Returns calculated sum
	 */
	public int sum(int a, int b) {
		return a + b;
	}
	
	//difference
	public int difference(int a, int b) {
		return a - b;
	}
	
	// multiply
	public int multiply(int a, int b) {
		return a * b;
	}
	
	// find square	
	public int square(int number) {
		int square = number * number;
		return square;
	}
}

//TEST DRIVEN DEVELOPMENT
//STEP I:
//Write a Test. See it Fail.

//STEP II:
//Write Code for it. See it Pass.

//STEP II:
//Refactor
