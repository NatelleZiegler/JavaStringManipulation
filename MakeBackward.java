import java.util.*;
public class MakeBackward {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		System.out.println(backwards(input));
	}
	
	public static String backwards(String str) {
		String newString = "";
		for(int i = (str.length() - 1); i >= 0; i--) {
			newString += str.charAt(i);
		}
		return newString;
	}
}