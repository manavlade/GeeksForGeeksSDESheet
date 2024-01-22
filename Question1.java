public class Question1 {
    /*
     * Question 1
     * Given an array of N strings, find the longest common prefix among all strings
     * present in the array.
     */
    String longestCommonPrefix(String arr[], int n) {
        if (n == 0) {
            return "-1";
        }

        String prefix = arr[0];

        for (int i = 1; i < n; i++) {
            int j = 0;

            while (j < prefix.length() && j < arr[i].length() && prefix.charAt(j) == arr[i].charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);

            if (prefix.equals("-1")) {
                return "-1";
            }
        }
        return prefix;
    }
}