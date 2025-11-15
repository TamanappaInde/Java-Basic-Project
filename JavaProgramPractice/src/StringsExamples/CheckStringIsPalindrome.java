package StringsExamples;

public class CheckStringIsPalindrome {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String str = "madam";
		String reversed = new StringBuilder(str).reverse().toString();
		if (str.equals(reversed)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is not a Palindrome");
		}

	}

}
