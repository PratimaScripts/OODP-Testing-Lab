
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveStringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	public void testStringHavingAInFirstCharacterOnly() {
		assertEquals("BCD",helper.removeAInFirst2Chars("ABCD"));
	}
	
	@Test
	public void testStringHavingAInFirst2CharsOnlyAnd4Chars() {
		assertEquals("BBA", helper.removeAInFirst2Chars("ABBA"));
	}
	
	@Test
	public void testStringHavingNoAInFirst2CharsOnly() {
		assertEquals("BBAA", helper.removeAInFirst2Chars("BBAA"));
	}
	
	@Test
	public void testStringWith2Chars() {
		assertEquals("B", helper.removeAInFirst2Chars("AB"));
	}
	
	@Test
	public void testStringWith1Char() {
		assertEquals("B", helper.removeAInFirst2Chars("B"));
	}
	
	@Test
	public void testStringWith1CharA() {
		assertEquals("", helper.removeAInFirst2Chars("A"));
	}
}
