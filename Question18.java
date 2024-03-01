public class Question18 {
    public static long[] productExceptSelf(int nums[], int n) {
        /*
         * Question
         * Given an array nums[] of size n, construct a Product Array P (of same size n)
         * such that P[i] is equal to the product of all the elements of nums except
         * nums[i].
         * Example
         * Input:
         * n = 5
         * nums[] = {10, 3, 5, 6, 2}
         * Output:
         * 180 600 360 300 900
         * Explanation:
         * For i=0, P[i] = 3*5*6*2 = 180.
         * For i=1, P[i] = 10*5*6*2 = 600.
         * For i=2, P[i] = 10*3*6*2 = 360.
         * For i=3, P[i] = 10*3*5*2 = 300.
         * For i=4, P[i] = 10*3*5*6 = 900.
         */
        long result[] = new long[n];

        long[] leftProduct = new long[n];
        leftProduct[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }
        long[] rightProduct = new long[n];
        rightProduct[n - 1] = 1;

        for (int j = n - 2; j >= 0; j--) {
            rightProduct[j] = rightProduct[j + 1] * nums[j + 1];
        }
        for (int j2 = 0; j2 < n; j2++) {
            result[j2] = leftProduct[j2] * rightProduct[j2];
        }
        return result;
    }

}
