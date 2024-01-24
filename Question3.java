/*
 Question 3
 Given an array arr of distinct elements of size N, the task is to rearrange the 
elements of the array in a zig-zag fashion so that the converted array should be 
in the below form: 
arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n]. 
NOTE: If your transformation is correct, the output will be 1 else the output will be 0. 
 */
public class Question3 {
    public void zigZag(int a[], int n) {
        // Code your solution here.
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (a[i] > a[i + 1]) {
                    // swap
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            } else {
                if (a[i] < a[i + 1]) {
                    // swap
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}
