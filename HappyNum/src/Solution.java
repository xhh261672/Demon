import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/4/30.
 */
public class Solution {
    public boolean isHappy(int n) {
        if (n <= 0) return false;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        while (n != 1){
            System.out.println(n);
            int sum = 0;
            while (n != 0){
                sum += ((n%10)*(n%10));
                n /= 10;
            }
            n = sum;
            if (map.containsKey(n))
                return false;
            map.put(n, n);
        }
        return true;
    }

    public static void main (String []args){
        Solution solution = new Solution();
        System.out.println(solution.isHappy(2));
    }

}
