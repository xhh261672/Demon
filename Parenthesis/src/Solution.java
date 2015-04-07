import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/4/7.
 */
public class Solution {
    private List<String> list;
    public List<String> generateParenthesis(int n) {
        list = new ArrayList<String>();
        if (n == 0) return list;

        getParenthesis(list, new StringBuffer(), n, n);
        return list;
    }

    private void getParenthesis(List<String>list, StringBuffer sb, int l, int r){
        if (l == 0 && r == 0 ){
            list.add(sb.toString());
            return;
        }
        if (l < 0 || r < 0 || l > r) return;
        sb.append("(");
        getParenthesis(list, sb, l-1, r);
        sb.deleteCharAt(sb.length()-1);

        sb.append(")");
        getParenthesis(list, sb, l, r-1);
        sb.deleteCharAt(sb.length()-1);
    }
}
