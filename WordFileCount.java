import java.util.*;
import java.io.*;
public class WordFileCount {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int wordCount = 0;
		System.out.print("Enter the name of a file: ");
		String input = scan.nextLine();
		File myFile = new File(input);
		Scanner scanFile = new Scanner(myFile);
		while(scanFile.hasNextLine()) {
			String line = scanFile.nextLine();
			String[] words = line.split(" ");
			for(int i = 0; i < words.length; i++) {
				if(words[i] != "." && words[i] != "," && words[i] != "?" && words[i] != "!") {
					wordCount += 1;
				}
			}
		}
		scanFile.close();
		System.out.println("There are " + wordCount + " words in your file.");
	}
}