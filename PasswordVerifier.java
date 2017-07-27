public class PasswordVerifier {
	
	public static boolean isSixCharacters(String password) {
		boolean isSix;
		if(password.length() >= 6) {
			isSix = true;
		}
		else {
			isSix = false;
		}
		return isSix;
	}
	
	public static boolean caseUpper(String password) {
		boolean hasUpper = false;
		for(int i = 0; i < password.length(); i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				hasUpper = true;
			}
		}
		return hasUpper;
	}
	
	public static boolean caseLower(String password) {
		boolean hasLower = false;
		for(int i = 0; i < password.length(); i++) {
			if(Character.isLowerCase(password.charAt(i))) {
				hasLower = true;
			}
		}
		return hasLower;
	}
	
	public static boolean hasDigit(String password) {
		boolean hasDigit = false;
		for(int i = 0; i < password.length(); i++) {
			if(Character.isDigit(password.charAt(i))) {
				hasDigit = true;
			}
		}
		return hasDigit;
	}
}