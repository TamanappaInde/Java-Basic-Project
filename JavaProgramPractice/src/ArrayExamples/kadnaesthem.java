package ArrayExamples;

public class kadnaesthem {

	
	    public static void main(String[] args) {
	        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        int maxSum = kadane(arr);
	        System.out.println("Maximum Subarray Sum = " + maxSum);
	    }

	    static int kadane(int[] arr) {
	        int maxSoFar = arr[0];
	        int currMax = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            currMax = Math.max(arr[i], currMax + arr[i]);
	            maxSoFar = Math.max(maxSoFar, currMax);
	        }
	        return maxSoFar;
	    }
	

}
