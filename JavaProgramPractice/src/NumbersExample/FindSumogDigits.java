package NumbersExample;

public class FindSumogDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 12345;
		
		int sum = 0;
		while (num1 > 0) {
			
			int digit = num1 % 10;
			sum += digit;
			num1 /= 10;
		}
		System.out.println(sum);
		
        int num = 12345;
		int  result  = sumofDigits(num);
		System.out.println(result);
	}
	
	// using recursion
	public static int sumofDigits(int num) {
		
		if (num == 0) {
			return 0;
		}
		
		return (num % 10) + sumofDigits(num/10);
	}

}
