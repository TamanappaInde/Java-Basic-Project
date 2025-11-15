package ArrayExamples;

import java.util.Arrays;

public class MoveAllZerosTolast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {0,1,2,3,0,4,5,0,6,0,7};
		int index = 0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}
		while (index < arr.length) {
			arr[index++] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}

}
