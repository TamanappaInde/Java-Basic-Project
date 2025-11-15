package NumbersExample;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int rev = 0;
		while (num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		System.out.println(rev);
		
		// check num is palindrome
		int num1 = 121;
		int rev1 = 0;
		int original = num1;
		while (num1 != 0) {
			int digit = num1 % 10;
			rev1 = rev1 *10 + digit;
			num1 /= 10;
		}
		if (original == rev1) {
			System.out.println("Given number is palindrome");
		} else {
			System.out.println("Given number is not a palindrome");
		}

	}

}
