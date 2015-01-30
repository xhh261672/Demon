/**
 * Created by Administrator on 2015/1/30.
 */
public class Solution {
    public int findMin(int[] num) {
        int l = 0, r = num.length - 1;
        while(l < r){
//            System.out.println(l + " " + r);
            int m = l + (r - l) / 2;
            if (num[m] > num[r]) l = m + 1;
            else r = m;
        }

        return num[l];
    }

    public static void main(String []args){
        Solution solution = new Solution();
        int []num = {4, 5, 6, 7, 0, 1, 2};
        System.out.print(solution.findMin(num));
    }


}
