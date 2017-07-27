import java.util.*;
public class PasswordTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String input = scan.nextLine();
		boolean hasSix, hasUpper, hasLower, hasDigit;
		hasSix = PasswordVerifier.isSixCharacters(input);
		hasUpper = PasswordVerifier.caseUpper(input);
		hasLower = PasswordVerifier.caseLower(input);
		hasDigit = PasswordVerifier.hasDigit(input);
		
		if(hasSix && hasUpper && hasLower && hasDigit) {
			System.out.println("The password you entered is valid.");
		}
		else {
			System.out.println("Your password is not valid.");
		}
		
		if(hasSix == false) {
			System.out.println("Your password must be at least six characters long.");
		}
		
		if(hasUpper == false) {
			System.out.println("Your password must contain at least one uppercase letter.");
		}
		
		if(hasLower == false) {
			System.out.println("Your password must contain at least on lowercase letter.");
		}
		
		if(hasDigit == false) {
			System.out.println("Your password must have at least one digit.");
		}
	}
}