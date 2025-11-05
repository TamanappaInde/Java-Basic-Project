package ArrayExamples;
import java.util.*;

public class ArrayRemoveDuplicates {

	public static void main(String[] args) {
		
//		// remove duplicates using set
//		int[] arr = {1,2,2,3,4,5,5,6,7};
//		Set<Integer> set = new HashSet<>();
//		for (int num : arr) {
//			set.add(num);
//		}
//		System.out.println(set);
//
//		// remove duplicates using java 8 stream
//		int[] result = Arrays.stream(arr).distinct().toArray();
//		System.out.println(Arrays.toString(result));
//		
//		// remove duplicates using arraylist
//		List<Integer> list = new ArrayList<>();
//		for (int num : arr) {
//			if(!list.contains(num)) {
//				list.add(num);
//			}
//		}
//		System.out.println(list);
//		
//		// remove duplicates using loop
//		int[] temp = new int[arr.length];
//		int j = 0;
//		Arrays.sort(arr);
//		for (int i=0;i<arr.length-1;i++) {
//			if (arr[i] != arr[i+1]) {
//				temp[j++] = arr[i];
//			}
//		}
//		temp[j++] = arr[arr.length-1];
//		for (int i=0;i<j;i++) {
//			System.out.println(temp[i] + " ");
//		}
		
		// 1 Remove duplicates using HashSet
		int[] arr = {1,2,2,3,4,5,5,6,7,7,8,9,10,10};
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}
		System.out.println(set);
		
		// 2 Remove duplicates from array using java 8
		int[] result = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(result));
		
		// 3 Remove duplicates using ArrayList
		List<Integer> list = new ArrayList<>();
		for (int i=0;i<arr.length;i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		System.out.println(list);
		
		// 4 Remove duplicates from array using loop
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i=0;i<arr.length-1;i++) {
			if (arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length-1];
		for (int i=0;i<j;i++) {
			System.out.println(temp[i] + " ");
		}
		
	}

}
