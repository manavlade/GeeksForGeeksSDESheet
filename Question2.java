import java.util.ArrayList;
import java.util.Arrays;

/*
 Question 2
 Given two unsorted arrays A of size N and B of size M of distinct elements,
the task is to find all pairs from both arrays whose sum is equal to X.
Note: All pairs should be printed in increasing order of u. For eg. for two pairs
 (u1,v1) and (u2,v2), if u1 < u2 then
(u1,v1) should be printed first else second.
 */
public class Question2 {

    public pair[] allPairs(long A[], long B[], long N, long M, long X) {
        ArrayList<pair> a = new ArrayList<>();

        Arrays.sort(A);
        Arrays.sort(B);

        int l = 0, h = B.length - 1;

        while (l < A.length && h >= 0) {
            if (A[l] + B[h] == X) {
                pair p = new pair(A[l], B[h]);
                a.add(p);
                l++;
                h--;
            } else if (A[l] + B[h] < X)
                l++;
            else
                h--;
        }
        pair pairs[] = new pair[a.size()];
        pairs = a.toArray(pairs);

        return pairs;
    }
}
