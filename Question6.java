import java.util.ArrayList;
import java.util.Arrays;

/*
 Question 6
 Given an array arr[ ] of length N consisting cost of N toys and an integer K 
 depicting the amount with you. Your task is to find maximum number of toys you can buy
  with K amount. 
 */
public class Question6 {
    static int toyCount(int N, int K, int arr[]) 
    {
        Arrays.sort(arr);
        int count = 0, sum  = 0;
        for (int i = 0; i < arr.length; i++) {
            if(sum + arr[i] <= K){
                sum += arr[i];
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
}
