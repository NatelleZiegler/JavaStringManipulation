import java.util.*;
public class PhoneTranslator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String number;
		boolean validNumber;
		do {
			System.out.println("For this program, enter a 10-character telephone number in the format XXX-XXX-XXXX.");
			System.out.print("Enter a phone number: ");
			number = scan.nextLine();
			validNumber = isValidNumber(number);
			if(validNumber == false) {
				System.out.println("Your number was formatted incorrectly.");
			}
		} while(validNumber != true);
		System.out.println(formatPhone(number));
	}
	
	public static boolean isValidNumber(String phoneNumber) {
		boolean isValid = true;
		if(phoneNumber.length() != 12) {
			isValid = false;
		}
		else {
			for(int i = 0; i < phoneNumber.length(); i++) {
				if(Character.isLetterOrDigit(phoneNumber.charAt(i)) == false && (i != 3 && i != 7)) {
					isValid = false;
				}
				if(i == '3' || i == '7') {
					if(phoneNumber.charAt(i) != '-') {
						isValid = false;
					}
				}
			}
		}
		return isValid;
	}
	
	public static String formatPhone(String number) {
		for(int i = 0; i < number.length(); i++) {
			if(Character.isLetter(number.charAt(i))) {
				char letter = number.charAt(i);
				letter = Character.toUpperCase(letter);
				char num = '0';
				switch(letter) {
					case 'A':
					case 'B':
					case 'C':
						num = '2';
					break;
					case 'D':
					case 'E':
					case 'F':
						num = '3';
					break;
					case 'G':
					case 'H':
					case 'I':
						num = '4';
					break;
					case 'J':
					case 'K':
					case 'L':
						num = '5';
					break;
					case 'M':
					case 'N':
					case 'O':
						num = '6';
					break;
					case 'P':
					case 'Q':
					case 'R':
					case 'S':
						num = '7';
					break;
					case 'T':
					case 'U':
					case 'V':
						num = '8';
					break;
					case 'W':
					case 'X':
					case 'Y':
					case 'Z':
						num = '9';
					break;
				}
				number = number.replace(letter, num);
			}
		}
		return number;
	}
}