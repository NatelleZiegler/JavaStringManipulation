import java.util.*;
public class VowelsAndConsonants {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		VowelTester myTest = new VowelTester(input);
		String choiceString;
		char choice; //the user's selection from the menu
		do {
			System.out.println();
			System.out.println("a. Count the number of vowels in a string");
			System.out.println("b. Count the number of consonants in a string");
			System.out.println("c. Count both the vowels and the consonants in the string");
			System.out.println("d. Enter another string");
			System.out.println("e. Exit the program");
			System.out.println();
			System.out.print("Enter a selection from the following menu: ");
			choiceString = scan.nextLine();
			choice = choiceString.charAt(0);
			choice = Character.toLowerCase(choice);
			switch(choice) {
				case 'a':
					System.out.println("There are " + myTest.numVowels() + " vowels in your string.");
				break;
				case 'b':
					System.out.println("There are " + myTest.numConsonants() + " consonants in your string.");
				break;
				case 'c':
					System.out.println("There are " + (myTest.numConsonants() + myTest.numVowels()) + " consonants and vowels in your string.");
				break;
				case 'd':
					System.out.print("Enter another string to test: ");
					input = scan.nextLine();
					myTest.setString(input);
				break;
				case 'e':
				break;
				default:
					System.out.println("Please enter a valid choice from the menu.");
			}
		} while(choice != 'e');
	}
}