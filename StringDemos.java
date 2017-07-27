public class StringDemos {
	public static void main(String[] args) {
		StringOperations ops = new StringOperations();
		String str = "the dog jumped over the fence the the world the face ttttttttt";
		String lana = "I still get trashed";
		int numWords = ops.wordCount(lana);
		System.out.println(numWords + " words.");
		char[] letters = {'H', 'e', 'l', 'l', 'o'};
		String word = ops.arrayToString(letters);
		System.out.println(word);
		String string1 = "the";
		String string2 = "that";
		char frequent = ops.mostFrequent(str);
		System.out.println(frequent);
		String str2 = ops.replaceSubstring(str, string1, string2);
		System.out.println(str2);
	}
}