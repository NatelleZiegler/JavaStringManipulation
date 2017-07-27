import java.util.*;
public class PigLatin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		System.out.println(makePigLatin(input));
	}
	
	public static String makePigLatin(String str) {
		//breaking the string up into words
		String[] words = str.split(" ");
		//working with each word
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() > 1) {
				char firstLetter = words[i].charAt(0);
				StringBuilder strBuild = new StringBuilder(words[i]);
				strBuild = strBuild.deleteCharAt(0);
				strBuild = strBuild.append(firstLetter + "AY ");
				words[i] = strBuild.toString();
			}
			else {
				words[i] = words[i] + "AY ";
			}
		}
		
		String latinString = "";
		for(int i = 0; i < words.length; i++) {
			latinString += words[i];
		}
		return latinString;
	}
}