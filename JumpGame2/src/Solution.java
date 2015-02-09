/**
 * Created by Administrator on 2015/2/9.
 */
public class Solution {
    public int jump(int[] A) {
        int n = A.length;
        if (n <= 1) return 0;

        int i = 0, j = 1, end = 0, step = 0;

        while (i < n-1 && i+A[i] < n-1){
            for (end = j; j<= i+A[i];j++){
                end = (end + A[end] > j + A[j]) ? end : j;
            }
            i = end; step++;
        }

        return ++step;
    }

    public int jump2(int []A){
        int n = A.length;
        if (n <= 1) return 0;

        int maxReach = A[0], curReach = A[0];
        int step = 1;
        for (int i= 1; i <= Math.min(n, maxReach); i++){
            curReach = Math.max(curReach, i + A[i]);
            if (i == n-1) return step;

            if (i == maxReach){
                maxReach = curReach;
                step++;
            }
        }
        return 0;
    }

    public static void main(String []args){
        Solution solution = new Solution();
        int []A = {1,1,1,1};
        System.out.print(solution.jump(A));
    }
}
