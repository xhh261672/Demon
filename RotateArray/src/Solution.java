/**
 * Created by Administrator on 2015/3/16.
 */
public class Solution {
    public void rotate2(int[] nums, int k) {
        if (k == 0) return;
        int n= nums.length;
        if (n == 0 || n == 1) return;
        while (k > 0){
            int temp = nums[n-1];
            for (int i = n-1; i > 0; i--)
                nums[i] = nums[i-1];
            nums[0] = temp;
            k--;
        }
        return;
    }
    public void rotate(int[] nums, int k){
        if (k == 0) return;
        int n = nums.length;
        if (n==0 || n == 1) return;

        k %= n;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
        return;
    }

    private void reverse(int []nums, int left, int right) {
        while (left < right){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++; right--;
        }
    }


    public static void main(String []args){
        Solution solution = new Solution();
        int []nums = {1,2,3,4,5,6,7};
//        solution.rotate(nums, 3);

        short s1 = 1;
        s1 += 1;
        System.out.println(s1);
    }

    public static void fermin(int i){
        i++;
    }
}
