package NumbersExample;

public class CheckNumberisArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		int digits = String.valueOf(num).length();
		int original = num;
		double result = 0;
		while (num > 0) {
			int digit = num % 10;
			result = result + Math.pow(digit, digits);
			num /= 10;
		}
		if (original == result) {
			System.out.println("Given number is a armstrong number");
		} else {
			System.out.println("Given number is not a armstrong number");
		}

	}

}
