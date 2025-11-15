package StringsExamples;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABC";
		permuet(str,"");
	}
	
	static void permuet(String str, String result) {
		
		if (str.isEmpty()) {
            System.out.println(result);
            return;
        }
		
		for (int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			String remaining = str.substring(0, i) + str.substring(i+1);
			permuet(remaining, result+ch);
		}
	}

}
