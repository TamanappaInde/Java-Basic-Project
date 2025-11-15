package StringsExamples;

public class CountOccurencesofCharinString {

	public static void main(String[] args) {
		
		// Using loop
		String str = "tamanappa123";
		int count = 0;
		char target = 'a';
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i) == target) {
				count++;
			}
		}
		System.out.println(count);
		
		// Using Java 8 Streams
		long count1 = str.chars().filter(ch->ch==target).count();
		System.out.println(count1);
		
		// Using String replace
		int orgstr = str.length();
		int newstrln = str.replace("a", "").length();
		int count2 = orgstr - newstrln;
		System.out.println(count2);
		
		
		

	}

}
