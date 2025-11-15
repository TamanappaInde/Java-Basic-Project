package StringsExamples;

public class StringRemoveSpecialChars {

	public static void main(String[] args) {
		// Remove special chars and count
		
		String str = "This<>)( is a @#$ state street account";
		String cleaned = str.replaceAll("[^a-zA-Z]", " ");
		System.out.println(cleaned);
		
		int count = cleaned.replace(" ", "").length();
		System.out.println(count);

	}

}
