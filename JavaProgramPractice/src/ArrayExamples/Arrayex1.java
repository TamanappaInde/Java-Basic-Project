package ArrayExamples;
import java.util.*;
public class Arrayex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 12, 15, 17, 19, 21, 45,100,200};

		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		for (int num : arr) {
			if (num > largest) {
				secondlargest = largest;
				largest = num;
			} else if (num > secondlargest && num != largest) {
				secondlargest = num;
			}
		}
		System.out.println(secondlargest);
		
		//
		String str = "I love Selenium and Java with BDD Cucumber";
		str = str.toLowerCase();
		Set<Character> set = new HashSet<>();
		for (char ch : str.toCharArray()) {
			set.add(ch);
		}
		System.out.println(set);
		
		HashMap<Character,Integer> charcount = new HashMap<>();
		for (char ch : str.toCharArray()) {
			charcount.put(ch, charcount.getOrDefault(ch, 0)+1);
		}
		for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
		
		// 
		
	}

}
