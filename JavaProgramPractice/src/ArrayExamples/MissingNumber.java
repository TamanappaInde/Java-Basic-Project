package ArrayExamples;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,4,5,6};
		int n = 6;
		int expectedsum = n * (n+1)/2;
		int actualsum = 0;
		for (int num : arr) {
			actualsum += num;
		}
		int missingnu = expectedsum- actualsum;
		System.out.println(missingnu);

	}

}
