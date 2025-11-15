package StringsExamples;

import java.util.Arrays;

public class CheckStringsareAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "listen"; //
		String str2 = "silent";
		
		boolean isAnagrams = true;
		str = str.replaceAll("\\s+", " ").toLowerCase();
		str2 = str2.replaceAll("\\s+", " ").toLowerCase();
		if (str.length() != str2.length()) {
			isAnagrams = false;
			
		}
		char[] chars1 = str.toCharArray();
		char[] chars2 = str2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		Arrays.equals(chars1, chars2);
		System.out.println("The given strings are anagrams");
		

	}

}
