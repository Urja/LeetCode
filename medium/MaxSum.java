package medium;

/**
 * Given an array of integers of size ‘n’.
 * Calculate the maximum sum of ‘k’
 * consecutive elements in the array.
 */
public class MaxSum {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(getMaximumSum(arr, k,n));
    }
    private static int getMaximumSum(int[] arr, int k, int n){
        if(n < k){
            return -1;
        }
        int maximumSum =0;
        for(int i = 0; i < k ;i++){
            maximumSum += arr[i];
        }

        int currentSum = maximumSum;
        for(int i = k; i < n ;i++){
            currentSum += arr[i]-arr[i-k];
            maximumSum = Math.max(maximumSum, currentSum);
        }
        return maximumSum;
    }
}
