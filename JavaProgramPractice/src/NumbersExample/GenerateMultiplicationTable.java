package NumbersExample;

public class GenerateMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		for (int i=1;i<=10;i++) {
			System.out.println(num + "X" + i + "=" + (num * i));
		}
		
		int rows = 6;
		for (int i=rows;i>=1;i--) {
			System.out.println("*".repeat(2*i-1));
		}

	}

}
