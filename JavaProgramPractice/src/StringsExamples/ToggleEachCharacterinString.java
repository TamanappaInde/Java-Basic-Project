package StringsExamples;

public class ToggleEachCharacterinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "tamanappa INDE";
		
		StringBuilder result = new StringBuilder();
		
		for (int i=0; i<str.length();i++) {
			
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				result.append(Character.toUpperCase(ch));
			} else {
				result.append(Character.toLowerCase(ch));
			}
		}
		System.out.println(result);
		

	}

}
