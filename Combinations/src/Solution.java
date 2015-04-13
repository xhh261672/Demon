import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/4/11.
 */
public class Solution {
    public static List<List<Integer>> re = new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        re.clear();
        if (n == 0 || k ==0 || n < k) return re;

        for (int i  = 1; i <= n; i++){
            genCombine(i, k, n, new ArrayList<Integer>());
        }

        return re;
    }

    private void genCombine(int index, int k, int n, List<Integer>temp){
        if (k == 1){
            temp.add(index);
            List<Integer> l = new ArrayList<Integer>(temp);
            re.add(l);
//            System.out.println(l);
            return;
        }
        temp.add(index);
        for (int i = index+1 ; i <= n; i++){
            genCombine(i, k-1, n, temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main (String []args){
        Solution solution = new Solution();
        solution.combine(2,1);
        System.out.println(re);
    }
}
