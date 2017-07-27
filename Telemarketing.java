import java.util.*;
public class Telemarketing {
	public static void main(String[] args) {
		String[] names = new String[5];
		String[] numbers = new String[5];
		names[0] = "Harrison, Rose";
		numbers[0] = "555-2234";
		names[1] = "James, Jean";
		numbers[1] = "555-9098";
		names[2] = "Smith, William";
		numbers[2] = "555-1785";
		names[3] = "Smith, Brad";
		numbers[3] = "555-9224";
		names[4] = "Conrad, Joseph";
		numbers[4] = "555-8383";
		
		String lookUp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first few characters of the last name to look up: ");
		lookUp = scan.nextLine();
		for(int i = 0; i < names.length; i++) {
			if(names[i].startsWith(lookUp)) {
				System.out.print(names[i] + "\t\t");
				System.out.print(numbers[i]);
				System.out.println();
			}
		}
	}
}