package StringsExamples;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		// 1 Remove Duplicates from String using Set
		String str1 = "tamanappainde";
		Set<Character> set = new HashSet<>();
		Set<Character> duplicates = new HashSet<>();
		for (char ch : str1.toCharArray()) {
			if (!set.add(ch)) {
				duplicates.add(ch);
			}
		}
		System.out.println(set);
		
		// 2 Using StringBuilder and Indexof
		StringBuilder result = new StringBuilder();
		for (int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			if (result.indexOf(String.valueOf(ch)) == -1) {
				result.append(ch);
			}
		}
		System.out.println(result);
		
//		StringBuilder result = new StringBuilder();
//		for (int i=0;i<str1.length();i++) {
//			char ch = str1.charAt(i);
//			if (result.indexOf(String.valueOf(ch)) == -1) {
//				result.append(ch);
//			}
//		}
//		System.out.println(result);
		
		// 3 Using Java 8
		String result1 = str1.chars()
				.mapToObj(c->String.valueOf((char) c))
				.distinct().collect(Collectors.joining());
		System.out.println(result1);
		
		// 4 Using Frequency Array
		int[] freq = new int[256];
		StringBuilder result2 = new StringBuilder();
		for (char ch : str1.toCharArray()) {
			if (freq[ch] == 0) {
				result2.append(ch);
				freq[ch] = 1;
			}
		}
		System.out.println(result2);

	}

}
