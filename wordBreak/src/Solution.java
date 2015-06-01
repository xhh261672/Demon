import java.util.HashSet;
import java.util.Set;

/**
 * Created by haeckel on 15-5-31.
 */
public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
//        if (s == null || wordDict.isEmpty()) return false;
//        int i = 0, j = 0;
//        while (i < s.length()){
//            while (j+1 <= s.length()){
//                if (wordDict.contains(s.substring(i, j+1))){
//                    i = j+1;
//                }
//                j++;
//            }
//            i++;
//        }
//
//        if (j >= s.length() && i < s.length()) return false;
//        return true;

        if (wordDict.isEmpty()) return false;
        int len = s.length();
        boolean []flag = new boolean[len+1];
        flag[0] = true;

        for (int i= 1; i < len+1; i++){
            for (int j = 0; j<i; j++){
                if (flag[j] && wordDict.contains(s.substring(j, i))){
                    flag[i] = true; break;
                }
            }
        }
        return flag[len];
    }

    public static void main (String []args){
    	Solution solution = new Solution();
    	Set set = new HashSet();
    	set.add("a");
    	solution.wordBreak("a", set);
    }
}
