package StringsExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExpansionCompression {

	public static void main(String[] args) {
		
		// String compression using loop
		String str = "aabbbcccc";
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
		
		// String compression using pattern
		StringBuilder result2 = new StringBuilder();
		Pattern p = Pattern.compile("(.)\\1*");
		Matcher m = p.matcher(str);
		while (m.find()) {
			String group = m.group();
			char ch = group.charAt(0);
			int count1 = group.length();
			result2.append(ch).append(count1);
		}
		System.out.println(result2);
		
		
		
		// String expansion using loop
		String str2 = "a2b3c4";
		StringBuilder result3 = new StringBuilder();
		char prevchar = 0;
		for (int i=0;i<str2.length();i++) {
			
			char ch = str2.charAt(i);
			if (Character.isLetter(ch)) {
				prevchar = ch;
			} else if (Character.isDigit(ch)) {
				int count3 = Character.getNumericValue(ch);
				for (int j=0;j<count3;j++) {
					result3.append(prevchar);
				}
			}
		}
		System.out.println(result3);
		
		// String expansion using pattern
		StringBuilder result4 = new StringBuilder();
		Pattern p1 = Pattern.compile("([a-zA-Z])(\\d+)");
		Matcher m1 = p1.matcher(str2);
		while(m1.find()) {
			char ch = m1.group(1).charAt(0);
			int count4 = Integer.parseInt(m1.group(2));
			for (int j=0;j<count4;j++) {
				result4.append(ch);
			}
		}
		System.out.println(result4);
		
	

	}

}
