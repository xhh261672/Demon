import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/3/11.
 */
public class Solution {
    /**
     *	奇数位上都是奇数或者偶数位上都是偶数
     *	输入：数组arr，长度大于2
     *	将arr调整成奇数位上都是奇数或者偶数位上都是偶数
     */
    public void oddInOddEvenInEven(int[] arr) {
        int n = arr.length;
        if (n < 2) return;
        int i = 0, j = 1;
        while (j < n){
            if (arr[i]%2 == 1 && arr[j]%2 == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i += 2; j += 2;
            }
        }
//        System.out.println(j);
        return;
    }

    public int getWinValue(int[] arr) {
        int n  = arr.length;
        if (n == 1) return arr[0];
        if (n == 2) return (arr[0] > arr[1]? arr[0] : arr[1]);

        int e1 = 0, e2 = n-1;
        int sum1 = 0, sum2 = 0;
        while (n > 0){
            if (arr[e1] >= arr[e2]){
                sum1 += arr[e1];
                e1++; n--;
            }else{
                sum1 += arr[e2];
                e2--; n--;
            }
            if (n == 0) break;
            if (arr[e1] >= arr[e2]){
                sum2 += arr[e1];
                e1++;n--;
            }else{
                sum2 += arr[e2];
                e2--;n--;
            }
        }
        return (sum1>sum2? sum1:sum2);
    }



    public static void main(String []args){
        int []arr = {1,9,1};
        Solution solution = new Solution();
        int val = solution.getWinValue(arr);
        System.out.println(val);
    }
}
