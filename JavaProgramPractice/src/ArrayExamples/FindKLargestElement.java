package ArrayExamples;

import java.util.Arrays;

public class FindKLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,40,50,70};
		int k = 3;
		Arrays.sort(arr);
		System.out.println(k + " th largest " + arr[arr.length-k]);

	}

}
