package StringsExamples;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I love Selenium and Java with BDD Cucumber";
		String toRepalce = "Java";
		String repalcestr = "Automation API";
		String[] words = repalcestr.split("\\s+");
		StringBuilder reversedWords = new StringBuilder();
		for (int i=0;i<words.length;i++) {
			reversedWords.append(new StringBuilder(words[i]).reverse());
			if (i < words.length-1) {
				reversedWords.append(" ");
			}
		}
		String output = str.replace(toRepalce, reversedWords.toString());
		System.out.println(output);

	}

}
