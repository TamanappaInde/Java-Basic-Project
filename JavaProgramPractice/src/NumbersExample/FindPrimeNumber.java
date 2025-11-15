package NumbersExample;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		boolean isPrime = true;
		if (num <= 1) {
			isPrime = false;
		} else {
			for (int i=2;i<Math.sqrt(num);i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println("Given number is a prime number");
			} else {
				System.out.println("Given number is not a prime number");
			}
		}
		
		// find all prime numbers between range
		int n = 20;
		for (int num1=2;num1<n;num1++) {
			boolean isPrime1 = true;
			
			for (int i=2;i<Math.sqrt(num1);i++) {
				if (num1 % i == 0) {
					isPrime =  false;
					break;
					
					
				}
			}
			if(isPrime1) {
				System.out.println(num1 + " ");
			}
		}
		

	}

}
