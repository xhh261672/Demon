import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/5/30.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])) return true;
            map.put(nums[i], true);
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                int j = map.get(nums[i]);
                if (i-j <= k) return true;
                //map.put(nums[i], i);
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i]))
        }
    }
}
