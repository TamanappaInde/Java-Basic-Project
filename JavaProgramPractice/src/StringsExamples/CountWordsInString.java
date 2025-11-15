package StringsExamples;

public class CountWordsInString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		String str = "this is a complex string test123";
		int charCount = str.length();
		String[] words = str.trim().split("\\s+");
		int wordscount = words.length;
		System.out.println(charCount);
		System.out.println(wordscount);
		
//		String cleaned = str.replaceAll("[0-9]", "");
//		System.out.println(cleaned);
		
		
		
		
		
	}

}
