import java.util.Arrays;
/*
 Question 5
 You are given two arrays, A and B, of equal size N. The task is to find the minimum
  value of A[0] * B[0] + A[1] * B[1] + .... + A[N-1] * B[N-1], where shuffling of 
  elements of arrays A and B is allowed.
 */
public class Question5 {
    public long minValue(long a[], long b[], long n) {
        long sum = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        for(long i = 0, j = n-1; i<n && j>=0; i++, j-- ){
            sum += a[(int)i] * b[(int)j];
        }
        return sum;
    }
}
