import java.util.*;
public class Repeat {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		char ch;
		do {
			for(int i = 0; i < 3; i++) {
				System.out.println("LALALA");
			}
			System.out.print("Do you want to repeat the program or quit? (R/Q) ");
			input = scan.nextLine();
			ch = testValidity(input);
			while(ch == 'Z') {
				System.out.println("Invalid input.");
				System.out.print("Do you want to repeat the program or quit? (R/Q) ");
				input = scan.nextLine();
				ch = testValidity(input);
			}
		} while(ch != 'Q');
	}

	public static char testValidity(String userInput) {
		char choice;
		if(userInput.length() > 1) {
			choice = 'Z';
			return choice;
		}
		char ch = userInput.charAt(0);
		if(Character.isDigit(ch)) {
			choice = 'Z';
		}
		if(Character.isLowerCase(ch)) {
			ch = Character.toUpperCase(ch);
		}
		if(ch == 'R' || ch == 'Q') {
			choice = ch;
		}
		else {
			choice = 'Z';
		}
		return choice;
	}
	
}