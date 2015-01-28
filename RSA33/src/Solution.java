/**
 * Created by Administrator on 2015/1/28.
 */
public class Solution {
    public int search(int[] A, int target) {
//        if (A[0] == target) return 0;
//        int pivot = 1;
//        for (; pivot < A.length; pivot ++){
//            if (A[pivot] == target) return pivot;
//            if (A[pivot] < A[pivot - 1])
//                break;
//        }

        int index = findIdx2(A, target);
        return index;
    }

    private int findIdx2(int[] A, int target){
        int n = A.length;
        int l = 0, r = n - 1;
        while (l < r){
            int  m = (l+r) / 2;
            if (A[m] > A[r]) l = m + 1;
            else r = m;
        }

        int rot = l;
        l = 0;
        r= n - 1;
        while (l <= r){
            int m = (l + r)/2;
            int realm = (m + rot)%n;

            if (A[realm] == target) return realm;
            if (A[realm] < target) l = m + 1;
            else r = m - 1;
        }
        return  -1;
    }

    private int findIdx(int []A, int pivot, int target){
        int l = pivot, r = A.length - 1;
        int m = (l + r) / 2;
        while (l <= r){
            if (A[m] == target) return m;
            if (A[m] > target) r = m - 1;
            else l = m + 1;

            m = (l + r) /2;
        }
        return -1;
    }

    public static void main(String []args){
        int []A = {4,5,6,7, 0, 1, 2};

        Solution solution = new Solution();
        System.out.println(solution.search(A, 1));
    }

}
