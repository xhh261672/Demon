/**
 * Created by Administrator on 2015/2/5.
 */
public class Solution {

    //weak solution  TLE...
    public boolean canJump(int[] A) {
        if (A.length == 0) return true;
        int last = A.length -1;

        for (int i = 0; i < last-1; i++){
            if (i+A[i] >= last) return true;
            int maxStep = i+A[i];
            if (maxStep + A[maxStep] >= last) return true;
            for (int j = i+1; j <= i+A[i]; j++){
                if (j + A[j] >= last) return true;
                maxStep = j+A[j];
                if (maxStep + A[maxStep] >= last) return true;
            }
        }

        return false;
    }

    //niubility solution O(n)
    public boolean canJump2(int []A){
        int end = 0;
        for (int i = 0; i <= end; i++){
            end = Math.max(end, i+A[i]);
            if (end >= A.length-1) return true;
        }
        return false;
    }
}
