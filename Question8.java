/*
 Question 8
 Given a boolean 2D array, where each row is sorted. Find the row with the maximum 
 number of 1s.
 */
public class Question8 {
    public static int maxOnes(int Mat[][], int N, int M) {
        int maxCount = 0;
        int maxRow = 0;

        for (int i = 0; i < N; i++) {
            // Use binary search to find the leftmost occurrence of 1 in each row
            int left = 0, right = M - 1;
            int count = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (Mat[i][mid] == 1) {
                    count = M - mid; // Count of 1s in the current row
                    right = mid - 1; // Move to the left to find the leftmost occurrence
                } else {
                    left = mid + 1; // Move to the right
                }
            }

            // Update the maximum count and row index
            if (count > maxCount) {
                maxCount = count;
                maxRow = i;
            }
        }

        return maxRow;
    }

}
