import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	void testStrWith2CharIsReveresed() {
		assertEquals("BA",helper.swapLast2Chars("AB"));
//		fail("Not yet implemented");
	}

	@Test
	void testStrWith4Chars() {
		assertEquals("RAINPOCHO",helper.swapLast2Chars("RAINPOCOH"));
	}
	
	@Test
	void testStrWith1Char() {
		assertEquals("A",helper.swapLast2Chars("A"));
	}
	
	@Test
	void testStrWith0Char() {
		assertEquals("",helper.swapLast2Chars(""));
	}

}
