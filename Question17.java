import java.util.ArrayList;

public class Question17 {
    /*
     * Question
     * Given a sorted array a[] of size n, delete all the duplicated elements from
     * a[] & modify the array such that only distinct elements should be present
     * there.
     * Note:
     * 1. Don't use set or HashMap to solve the problem.
     * 2. You must return the modified array size where only distinct elements are
     * present in the array, the driver code will print all the elements of the
     * modified array.
     */
    int remove_duplicate(int A[], int N) {
        if (N == 0 || N == 1) {
            return N;
        }
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != A[i + 1]) {
                A[j++] = A[i];
            }
        }
        A[j++] = A[N - 1];
        return j;
    }
}
