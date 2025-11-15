package NumbersExample;

public class PrintNumbers {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int n = 12;
		for (int i=1; i <= n;i++) {
			System.out.println(i + " ");
		}
		
		// check number is even or odd
		if (n % 2 == 0) {
			System.out.println("Given number is even");
		} else {
			System.out.println("Given number is odd");
		}

	}

}
