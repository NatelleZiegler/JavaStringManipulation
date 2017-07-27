import java.util.*;
public class BackwardString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		System.out.println(makeBackward(input));
	}
	
	public static String makeBackward(String str) {
		char[] myArray = str.toCharArray();
		String backward = "";
		for(int i = myArray.length - 1; i >= 0; i--) {
			backward += myArray[i];
		}
		return backward;
	}	
}