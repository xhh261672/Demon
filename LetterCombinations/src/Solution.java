import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/4/4.
 */
public class Solution {
    public String []ss = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> re = new ArrayList<String>();
        int l = digits.length();
        if (l == 0) return re;
        combinate("", digits, 0, re);
        return re;
    }

    private void combinate(String temp, String digits, int index, List<String> re){
        if (index >= digits.length()){
            re.add(temp);
            return;
        }
        String curLetters = ss[digits.charAt(index)-'2'];
        for (int i = 0; i < curLetters.length(); i++){
            combinate(temp+curLetters.charAt(i), digits, index+1, re);
        }
    }

}
