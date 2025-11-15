package ArrayExamplesP1;

import java.util.Arrays;

public class FindMaxMinElementfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if array is sorted
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int max = arr[arr.length-1];
		int min = arr[0];
		System.out.println(max);
		System.out.println(min);
		
		// if array is not sorted
		int[] arr1 = {10,25,30,20,15,22};
		Arrays.sort(arr1);
		int max1 = arr1[arr1.length-1];
		int min1 = arr1[0];
		System.out.println(max1);
		System.out.println(min1);
		
		// copy one array to another
		int[] a = {1,2,3,4,5};
		int[] b = new int[a.length];
		for (int i=0;i<a.length;i++) {
			b[i] = a[i];
		}
		System.out.println(Arrays.toString(b));
		
		// Reverse array
		int[] arr2 = {1,2,3,4,5,6,7,8,9};
		for (int i=arr2.length-1;i>=0;i--) {
			System.out.println(arr2[i] + " ");
		}
		
		// reverse an array using swap
		int start = 0;
		int end = arr2.length-1;
		while (start < end) {
			int temp = arr2[start];
			arr2[start] = arr2[end];
			arr2[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr2));
		
		

	}

}
