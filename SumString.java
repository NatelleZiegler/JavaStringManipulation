import java.util.*;
public class SumString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a series of numbers separated by comas: ");
		String input = scan.nextLine();
		String[] numbers = input.split(",");
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			sum += num;
		}
		System.out.println("The sum of your numbers is " + sum + ".");
	}
}