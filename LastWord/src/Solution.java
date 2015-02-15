/**
 * Created by Administrator on 2015/2/15.
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        String ss = s.trim();
        if (ss.length() == 0 || ss.length() == 1) return ss.length();
        int i = 0, j = ss.length()-1;
        while (j >= 0 && ss.charAt(j) != ' '){
            i++; j--;
        }
        return i;
    }
}
