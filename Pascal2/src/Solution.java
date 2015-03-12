import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2015/3/11.
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> re = new ArrayList<Integer>();
        re.add(1);
        if (rowIndex == 0) return re;
        re.clear();
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        for (int i = 1; i <= rowIndex; i++){
            re.clear();
            for (int j = 0; j < i+1; j++){
                if (j == 0 || j == i) re.add(1);
                else {
                    re.add(temp.get(j) + temp.get(j - 1));
                }
            }
            temp = new ArrayList<Integer>(re);
        }
        return re;
    }

    public List<Integer> getRow2(int rowIndex){
        List<Integer> re = new ArrayList<Integer>();
        for (int i = 0; i < rowIndex+1; i++)
            re.add(1);
        for (int i = 2; i <= rowIndex; i++){
            int pre = re.get(0);
            for (int j = 1; j < i; j++){
                int temp = pre + re.get(j);
                pre = re.get(j);
                re.set(j, temp);
            }
        }
        return re;
    }


    public static void main(String []args){
        Solution solution = new Solution();
        solution.getRow(2);
    }
}
