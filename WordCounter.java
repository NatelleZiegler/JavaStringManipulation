import java.util.*;
public class WordCounter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String input = scan.nextLine();
		System.out.println("There are " + countWords(input) + " words in your string.");
	}
	
	public static int countWords(String str) {
		int numWords;
		String[] tokens = str.split(" ");
		numWords = tokens.length;
		return numWords;
	}	
}