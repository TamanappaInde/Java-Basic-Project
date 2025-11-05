package ArrayExamples;

public class FindMajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,3,4,2,3,5,3};
		int count = 0, candidate = -1;
		for (int num : arr) {
			if (count == 0) {
				candidate = num;
				count += (num == candidate) ? 1 : -1;
			}
		}
		count = 0;
		for (int num : arr) {
			if (num == candidate) {
				count++;
			}
		}
		if (count > arr.length/2) {
			System.out.println("Majority of element: " + candidate);
		} else {
			System.out.println("No majority element");
		}

	}

}
