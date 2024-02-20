public class Question15 {
    /*
     * Question
     * Given an array Arr[] of N integers. Find the contiguous sub-array(containing
     * at least one number) which has the maximum sum and return its sum.
     * 
     * 
     * Example 1:
     * 
     * Input:
     * N = 5
     * Arr[] = {1,2,3,-2,5}
     * Output:
     * 9
     * Explanation:
     * Max subarray sum is 9
     * of elements (1, 2, 3, -2, 5) which
     * is a contiguous subarray.
     */
    long maxSubarraySum(int arr[], int n) {
       if(n == 0) {
        return 0;
       }       
       long sum_max = arr[0];
       long sum_curr = arr[0];

       for (int i = 1; i < n; i++) {
        int m = arr[i];
        sum_curr = Math.max(sum_curr + m, m);
        sum_max = Math.max(sum_curr, sum_max);
       }
       return sum_max;
    }
}
