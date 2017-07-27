import java.util.*;
public class SentenceCapitalizer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		capitalizer(input);
		System.out.println();
	}
	
	public static void capitalizer(String str) {
		StringTokenizer makeTokens = new StringTokenizer(str, ".!?", true);
		while(makeTokens.hasMoreTokens()) {
			String sentence = makeTokens.nextToken();
			sentence = sentence.trim();
			char replaceChar = sentence.charAt(0);
			replaceChar = Character.toUpperCase(replaceChar);
			char[] myArray = sentence.toCharArray();
			myArray[0] = replaceChar;
			String newString = "";
			for(int num = 0; num < myArray.length; num++) {
				newString += myArray[num];
			}
			System.out.print(newString);
			if(newString.equals(".") || newString.equals("!") || newString.equals("?")) {
				System.out.print(" ");
			}
		}
	}	
}