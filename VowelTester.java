public class VowelTester {
	private String testString;
	
	public VowelTester(String str) {
		testString = str;
	}
	
	public String getString() {
		return testString;
	}
	
	public void setString(String str) {
		testString = str;
	}
	
	public int numVowels() {
		char[] stringArray = testString.toCharArray();
		int numVowels = 0;
		for(int i = 0; i < stringArray.length; i++) {
			stringArray[i] = Character.toLowerCase(stringArray[i]);
			if(stringArray[i] == 'a' || stringArray[i] == 'e' || stringArray[i] == 'i' || stringArray[i] == 'o' || stringArray[i] == 'u') {
				numVowels++;
			}
		}
		return numVowels;
	}
	
	public int numConsonants() {
		char[] stringArray = testString.toCharArray();
		int numConsonants = 0;
		for(int i = 0; i < stringArray.length; i++) {
			stringArray[i] = Character.toLowerCase(stringArray[i]);
			if(!(stringArray[i] == 'a' || stringArray[i] == 'e' || stringArray[i] == 'i' || stringArray[i] == 'o' || stringArray[i] == 'u')) {
				if(Character.isLetter(stringArray[i])) {
					numConsonants++;
				}
			}
		}
		return numConsonants;
	}
}