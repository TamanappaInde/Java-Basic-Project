package StringsExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExpansion {

	public static void main(String[] args) {
		
		// String expansion using loop
		String str = "a1b2c3d4";
		StringBuilder result = new StringBuilder();
		char prevchar = 0;
		for (int i=0;i<str.length();i++) {
			 char ch = str.charAt(i);
			 if (Character.isLetter(ch)) {
				 prevchar = ch;
			 } else if (Character.isDigit(ch)) {
				 int count = Character.getNumericValue(ch);
				 for (int j=0;j<count;j++) {
					 result.append(prevchar);
				 }
			 }
		}
		System.out.println(result);
		
		// String expansion using Pattern
		StringBuilder result2 = new StringBuilder();
		Pattern p = Pattern.compile("([^a-zA-Z])(\\d+)");
		Matcher m = p.matcher(str);
		while(m.find()) {
			char ch = m.group(1).charAt(0);
			int count2 = Integer.parseInt(m.group(2));
			for (int j=0;j<count2;j++) {
				result2.append(ch);
			}
		}
		System.out.println(result2);

	}

}
