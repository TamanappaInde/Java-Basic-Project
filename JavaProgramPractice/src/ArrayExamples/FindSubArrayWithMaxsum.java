package ArrayExamples;

public class FindSubArrayWithMaxsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int maxsofar = arr[0];
		int currmax = arr[0];
		for (int i=1;i<arr.length;i++) {
			currmax = Math.max(arr[i], currmax + arr[i]);
			maxsofar = Math.max(maxsofar, currmax);
		}
		System.out.println(maxsofar);
	}

}
