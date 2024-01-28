/*
 Question 7
 Given a sorted array arr[] of size N. Find the element that appears only once in the
  array. All other elements appear exactly twice. 
 */
public class Question7 {
    int findOnce(int arr[], int n) {
        int low = 0, right  = n-1;

        while (low <  right) {
            int mid = low + (right - low) /2;
            if(mid % 2 == 0){
                if(mid < n-1 && arr[mid] == arr[mid+1]){
                    low = mid  +2;
                }
                else {
                    right = mid -1;
                }
            }
            else  {
                if(mid > 0  && arr[mid] == arr[mid -1]){
                    low  = mid +1;
                }
                else {
                    right = mid -1;
                }
            }
        }
        return arr[low];
    }
}
