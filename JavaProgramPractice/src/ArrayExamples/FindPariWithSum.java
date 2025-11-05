package ArrayExamples;

public class FindPariWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,7,4,5,9};
		int sum = 9;
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
				}
			}
		}

	}

}
