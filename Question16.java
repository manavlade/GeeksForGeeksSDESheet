public class Question16 {
    public static boolean isRotated(String str1, String str2) {
        // Your code here
        if (str1.length() < 2) {
            return false;
        }
        String res = str1.substring(2, str1.length()) + str1.substring(0, 2);
        String res1 = str1.substring(str1.length() - 2, str1.length()) + str1.substring(0, str1.length() - 2);
        // System.out.println(res1);
        if (res.equals(str2) || res1.equals(str2)) {
            return true;
        }
        return false;
    }
}
