package NumbersExample;

public class CountNumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int count = String.valueOf(num).length();
		System.out.println(count);
		
		int temp = num;
		int count1 = 0;
		while (temp != 0) {
			temp = temp / 10;
			count1++;
		}
		System.out.println(count1);

	}

}
