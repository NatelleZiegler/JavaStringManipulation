import java.util.*;
public class WordSeparator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		input = separate(input);
		System.out.println(input);
	}

	public static String separate(String str) {
		int endWord = str.length();
		for(int i = 1; i < str.length(); i++) {
			endWord = str.length();
			if(Character.isUpperCase(str.charAt(i))) {
				for(int j = (i + 1); j < endWord; j++) {
					if(Character.isUpperCase(str.charAt(j)) || (j == (str.length() - 1))) {
						endWord = j;
						StringBuilder strBuild = new StringBuilder(str);
						String newWord = str.substring(i, j);
						newWord = newWord.toLowerCase();
						newWord = " " + newWord;
						strBuild.replace(i, j, newWord);
						str = strBuild.toString();
					}
				}
			}
		}
		return str;
	}
}