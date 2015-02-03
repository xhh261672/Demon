/**
 * Created by Administrator on 2015/2/3.
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].length() == 0) return "";
        if (strs.length == 1) return strs[0];
        String pre = strs[0];
        int i = 1;
        while (i < strs.length){
            while (strs[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length()-1);
            i++;
        }

        return pre;
    }

    public String longestCommonPrefix2(String []strs){
        if (strs.length == 0 || strs[0].length() == 0) return "";
        if (strs.length == 1) return strs[0];

        for (int i = 0; i<strs[0].length(); i++){
            char c = strs[0].charAt(i);

            for (int j = 0; j < strs.length; j++){
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

    public String longestCommonPrefix3(String []strs){
        if (strs.length == 0 || strs[0].length() == 0) return "";
        if (strs.length == 1) return strs[0];

        String word = strs[0];
        int preLen = word.length();

        for (int i = 1; i < strs.length; i++){
            String nextword = strs[i];
            preLen = Math.min(preLen, nextword.length());
            for (int j = 0; j < preLen; j++){
                    if (word.charAt(j) != nextword.charAt(j)){
                    preLen = j;
                    break;
                }
            }
        }

        return word.substring(0, preLen);
    }
}
