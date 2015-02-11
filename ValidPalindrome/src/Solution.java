/**
 * Created by Administrator on 2015/2/11.
 */
public class Solution {
    public boolean isPalindrome(String s) {
        int l = s.length();
        if (l == 0 || l == 1) return true;
        s = s.toLowerCase();
        int i = 0, j = l-1;
        while (i <= j){
            while (i <=j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i <=j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (i <= j && s.charAt(i) != s.charAt(j)){
                return false;
            }else{
                i++; j--;
            }
        }
        return true;
    }

    public static void main(String []args){
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("1  211  "));
    }
}
