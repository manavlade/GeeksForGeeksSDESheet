import java.util.ArrayList;
import java.util.LinkedHashSet;

/*
 Question 
 Given a binary matrix your task is to find all unique rows of the given matrix in the 
 order of their appearance in the matrix.
 row = 3, col = 4 
M[][] = {{1 1 0 1},{1 0 0 1},{1 1 0 1}}
Output: $1 1 0 1 $1 0 0 1 $
Explanation: Above the matrix of size 3x4
looks like
1 1 0 1
1 0 0 1
1 1 0 1
The two unique rows are R1: {1 1 0 1} and R2: {1 0 0 1}. 
As R1 first appeared at row-0 and R2 appeared at row-1, in the resulting list, R1 is kept before R2.

LinkedHashSet<ArrayList<Integer>> h: A LinkedHashSet is used to store unique rows. It
 maintains the order of insertion and ensures that duplicates are not allowed.
 */
public class Question12 {
     public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        LinkedHashSet<ArrayList<Integer>> h = new LinkedHashSet<>();
        for (int i = 0; i < r; i++) {
            ArrayList<Integer> arr = new ArrayList<>();

            for (int j = 0; j < c; j++) {
                arr.add(a[i][j]);
            }
            h.add(new ArrayList<>(arr));
            
        }
        return new ArrayList<>(h);
    }

}
