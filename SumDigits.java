import java.util.*;
public class SumDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a series of digits with nothing separating them: ");
		String input = scan.nextLine();
		int sum = 0;
		int number;
		int high = 0;
		int low = 9;
		for(int i = 0; i < input.length(); i ++) {
			number = Character.getNumericValue(input.charAt(i));
			if(number > high) {
				high = number;
			}
			if(number < low) {
				low = number;
			}
			sum += number;
		}
		System.out.println("The sum of your numbers is " + sum + ".");
		System.out.println("The lowest value you entered was " + low + ".");
		System.out.println("The highest value you entered was " + high + ".");
	}
}