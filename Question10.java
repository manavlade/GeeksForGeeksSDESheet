import java.util.HashSet;

/*
 Question 10
Given a string S. The task is to find the first repeated character in it. We need to 
find the character that occurs more than once and whose index of second occurrence is
smallest. S contains only lowercase letters.
 */
public class Question10 {
    String firstRepChar(String s) {
        char st = '\0';
       HashSet<Character> sb = new HashSet<>();
       for (int i = 0; i < s.length(); i++) {
        if(!sb.contains(s.charAt(i))){
            sb.add(s.charAt(i));
        }

        else {
             st = s.charAt(i);
             break;
        }
       }
       return String.valueOf((st != '\0') ? st : "-1");
    }
}
