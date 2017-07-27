public class StringOperations {
	
	public static int wordCount(String str) {
		int numWords;
		String[] tokens = str.split(" ");
		numWords = tokens.length;
		return numWords;
	}
	
	public static String arrayToString(char[] chArray) {
		String word = "";
		for(int i = 0; i < chArray.length; i++) {
			word += chArray[i];
		}
		return word;
	}
	
	public static char mostFrequent(String str) {
		// Counts stores the count of each character.
		int[] counts = new int[256];

		// Initialize all counts to 0.
		for (int i = 0; i < counts.length; i++) {
			counts[i] = 0;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// Convert the character to its integer equivalent.
			int index = (int) ch;
			counts[index]++;
		}
		
		// Now determine which was the max.
		int max = 0;
		char maxChar = ' ';
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > max) {
				max = counts[i];
				maxChar = (char) i;
			}
		}
		return maxChar;
	}
	
	public static String replaceSubstring(String string1, String string2, String string3) {
		StringBuilder strBuild = new StringBuilder(string1);
		int subPlace = 0;
		int subEndPlace;
		while(subPlace != -1) {
			subPlace = strBuild.indexOf(string2);
			if(subPlace != -1) {
				subEndPlace = subPlace + string2.length();
				strBuild.replace(subPlace, subEndPlace, string3);
			}
		}
		String newString = strBuild.toString();
		return newString;
	}
}	