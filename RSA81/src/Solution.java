/**
 * Created by Administrator on 2015/1/29.
 */
public class Solution {
    public boolean search(int[] A, int target) {
        int l = 0, r = A.length - 1;
        while (l <= r){
            int m = (l + r) /2;
            if (A[m] == target) return true;
            else if (A[l] < A[m]){
                if (A[l] <= target && target < A[m])
                    r = m - 1;
                else
                    l = m + 1;
            }else if (A[l] > A[m]){
                if (A[m] < target && target <= A[r])
                    l = m + 1;
                else
                    r = m - 1;
            }else l++;// A[l] == A[m]
        }
        return false;
    }
}
