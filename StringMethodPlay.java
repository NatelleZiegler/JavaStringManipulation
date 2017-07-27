import java.util.*;
public class StringMethodPlay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string to test: ");
		String input = scan.nextLine();
		if(gerTest(input)) {
			System.out.println("Your string ends in -ger");
		}
		else {
			System.out.println("Your string does not end in -ger");
		}
		
		String str1 = "To be, or not to be.";
		String str2 = str1.replace('o', 'u');
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "William ";
		String str4 = " the ";
		String str5 = " Conqueror ";
		System.out.println(str3.trim() + str4.trim() + str5.trim());
		
		double number = 9.47;
		String stri;
		stri = String.valueOf(number);
		System.out.println(number + "\t" + stri);
	}
	
	public static boolean gerTest(String testString) {
		testString = testString.toLowerCase();
		boolean endsGer = testString.endsWith("ger");
		return endsGer;
	}	
}