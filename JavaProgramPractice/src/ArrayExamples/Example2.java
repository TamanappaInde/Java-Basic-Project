package ArrayExamples;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "tamanappainde sastur pune";
		str = str.replace(" ", "");
		Set<Character> set = new HashSet<>();
		Set<Character> duplicates = new HashSet<>();
		for (char ch : str.toCharArray()) {
			if (!set.add(ch)) {
				duplicates.add(ch);
			}
		}
		System.out.println("String without duplicates: " + set);
		System.out.println("Duplicate Chars : " + duplicates);

		
	}

}
