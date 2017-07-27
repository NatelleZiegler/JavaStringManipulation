import java.util.*;
public class NumUppercase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scan.nextLine();
		int number = str.length();
		int numUpper = 0; //the number of upper case characters in string str
		for(int i = 0; i < number; i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				numUpper += 1;
			}
		}
		if(numUpper > 1) {
			System.out.println("There are " + numUpper + " upper case characters in your string.");
		}
		else if(numUpper == 1) {
			System.out.println("There is " + numUpper + " upper case character in your string");
		}
		else {
			System.out.println("There are no upper case characters in your string.");
		}
	}
}