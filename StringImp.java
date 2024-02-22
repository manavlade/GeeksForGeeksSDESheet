import java.util.HashMap;
import java.util.Map;

public class StringImp {
    /*
     * Question
     * Given a string S consisting of lowercase Latin Letters. Return the first
     * non-repeating character in S. If there is no non-repeating character, return
     * '$'.
     * Input:
     * S = hello
     * Output: h
     * Explanation: In the given string, the
     * first character which is non-repeating
     * is h, as it appears first and there is
     * no other 'h' in the string.
     */
    static char nonrepeatingCharacter(String S) {
        Map<Character, Integer> hm = new HashMap<>();
        int n = S.length();

        for (int i = 0; i < n; i++) {
            char ch = S.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (int j = 0; j < n; j++) {
            char ch = S.charAt(j);
            if (hm.get(ch) == 1) {
                return ch;
            }
        }
        return '$';
    }

}

