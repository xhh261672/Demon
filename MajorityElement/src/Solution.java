/**
 * Created by Administrator on 2015/5/26.
 */
public class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        int majorityIndex = 0, count = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[majorityIndex]) count++;
            else count--;
            if (count == 0){
                majorityIndex = i;
                count = 1;
            }
        }
        System.out.println(majorityIndex);
        return nums[majorityIndex];
    }

    public static void main (String []args){
        Solution solution = new Solution();
        int []nums = {3,6,3,7,3,8,3,9,3,10,3};
        System.out.println(solution.majorityElement(nums));
    }
}
