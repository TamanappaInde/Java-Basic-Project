package StringsExamples;

import java.util.stream.IntStream;

public class StringReverse {

	public static void main(String[] args) {
		
		// 1 Reverse a String using loop
		String str1 = "tamanappa";
		String reversed = "";
		for (int i=str1.length()-1;i>=0;i--) {
			reversed = reversed + str1.charAt(i);
			
		}
		System.out.println(reversed);
		
		// 2 Reverse a String using StringBuilder
		String reversed2 = new StringBuilder(str1).reverse().toString();
		System.out.println(reversed2);
		
		// 3 Reverse a String using Stream
		char[] chars = str1.toCharArray();
		int start = 0;
		int end = chars.length-1;
		while (start < end) {
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			start++;
			end--;
		}
		String reversed3 = new String(chars);
		System.out.println(reversed3);
		
		// 4 Using IntStream and StringBuilder
		String reversed4 = IntStream.rangeClosed(1, str1.length())
				.mapToObj(i->str1.charAt(str1.length()-i))
				.collect(StringBuilder::new, StringBuilder::append,StringBuilder::append).toString();
		System.out.println(reversed4);
		
		
	}

}
