import java.util.*;
public class StringEval {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string you would like to evaluate: ");
		String str = scan.nextLine();
		int numDigits = 0;
		int numLowercase = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				numDigits++;
			}
			if(Character.isLowerCase(ch)) {
				numLowercase++;
			}
		}
		
		System.out.println("There are " + numDigits + " digits in your inputted string.");
		System.out.println("There are " + numLowercase + " lowercase letters in your inputted string.");
		if(isDotCom(str)) {
			System.out.println("Your string ends in .com");
		}
		else {
			System.out.println("Your string DOES NOT end in .com");
		}
		
		StringBuilder myString = new StringBuilder("ttttttttt");
		System.out.println(tConverter(myString));
	}
	
	public static boolean isDotCom(String str) {
		str = str.toLowerCase();
		boolean isCom;
		if(str.endsWith(".com")) {
			isCom = true;
		}
		else {
			isCom = false;
		}
		return isCom;
	}
	
	public static StringBuilder tConverter(StringBuilder strB) {
		int positon = strB.indexOf("t");
		while(positon != -1) {
			strB.setCharAt(positon, 'T');
			positon = strB.indexOf("t", positon + 1);
		}
		
		return strB;
	}
}