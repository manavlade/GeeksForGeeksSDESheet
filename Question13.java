import java.util.ArrayList;
/*
 Question 
Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check 
whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted.
 There can be duplicate elements.
 */
public class Question13 {
    public String isSubset(long a1[], long a2[], long n, long m) {
        if(checkSubset(a1, a2, n, m)){
            return "Yes";
        }
        else {
            return "No";
        }
    }

    private boolean checkSubset(long a1[], long a2[], long n, long m){
        ArrayList<Long> arr1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr1.add(a1[i]);
        }
        for (int i = 0; i < m; i++) {
            if(arr1.contains(a2[i])){
                arr1.remove(a2[i]);
            }
            else {
                return false;
            }
        }
        return true;
    }

}
