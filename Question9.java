/*
 Question 9
 Given a string str and another string patt. Find the minimum index of the character 
in str that is also present in patt.
 */
public class Question9 {
    public static int minIndexChar(String str, String patt) {
        for (int i = 0; i < str.length(); i++)
            if (patt.contains(str.charAt(i) + ""))
                return i;
        return -1;

    }
}
