package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractOnlyDigitsfromString {

	public static void main(String[] args) {
		
		String str = "order123_placed789_pincode412101";
		String onlydigits = str.replaceAll("\\D+", "");
		System.out.println(onlydigits);
		// \\D+ = replace non digit chars
		// \\d+ = replace digits
		
		// Remove all special chars
		String str1 = "!@suraj#$%^inde";
		String withoutspc = str1.replaceAll("[^a-zA-Z]", "");
		System.out.println(withoutspc);
		
		// Extract words starting with capital letter
		String str2 = "Hello My name is Suraj Inde am from Pune";
		Matcher matcher = Pattern.compile("\\b[A-Z][a-zA-Z]*\\b").matcher(str2);
		while(matcher.find()) {
			System.out.println(matcher.group());
			
		}
		
		// Replace multiple spaces with single spaces
		String str3 = "Hello My name   is    Suraj Inde   from Pune";
		String removespace = str3.replaceAll("\\s+", " ");
		System.out.println(removespace);
		
		// validate an email
		String str4 = "indesuraj@gmail.com";
		

	}

}
