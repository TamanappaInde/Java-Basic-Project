package StringsExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCompression {

	public static void main(String[] args) {
		
		// String compression using loop
		String str = "aabbbccc";
		StringBuilder result = new StringBuilder();
		int count = 1;
		for (int i=0;i<str.length()-1;i++) {
			if (str.charAt(i) == str.charAt(i+1)) {
				count++;
			} else {
				result.append(str.charAt(i)).append(count);
				count = 1;
			}
		}
		result.append(str.charAt(str.length()-1)).append(count);
		System.out.println(result);

		// String compression using Pattern
		StringBuilder result2 = new StringBuilder();
		Pattern p = Pattern.compile("(.)\\1*");
		Matcher m = p.matcher(str);
		while(m.find()) {
			String group = m.group();
			char ch = group.charAt(0);
			int count2 = group.length();
			result2.append(ch).append(count2);
		}
		System.out.println(result2);
	}

}
