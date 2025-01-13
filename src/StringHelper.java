
public class StringHelper {
	
	public String swapLast2Chars(String str) {
		int length = str.length();
		
		if (length<2) return str;
		
		String strMinusLast2Chars = str.substring(0, length-2);
		System.out.println(strMinusLast2Chars);
		
		char secondLastChar = str.charAt(length-2);
		char lastChar = str.charAt(length-1);
		
		return strMinusLast2Chars+ lastChar + secondLastChar;
		
//		char firstChar = str.charAt(0);
//		char secondChar = str.charAt(1);
//		return "" + secondChar + firstChar;
		
	}
	
	public String removeAInFirst2Chars(String str) {
		
		if (str.length()<2) {
			return str.replaceAll("A", "");
		}
			
		String first2Chars = str.substring(0,2);
		String afterFirst2Chars = str.substring(2);
		return first2Chars.replaceAll("A", "") + afterFirst2Chars;
	}
}
