package ArrayExamplesP1;

public class AvgofArraElements {

	public static void main(String[] args) {
		
		int[] arr = {2,4,5,6,7,8,9};
		int sum = 0;
		int avg = 0;
		
		for (int num : arr) {
			sum += num;
			avg = sum/arr.length;
		}
		System.out.println(avg);

	}

}
