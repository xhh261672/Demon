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
        while (i < n && j < n){
//            System.out.println(i + " " + j);
            if (arr[i] % 2== 0) i+= 2;
            if (arr[j] % 2 == 1) j += 2;
            if (i < n && j < n){
                if (arr[i]%2 == 1 && arr[j]%2 == 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
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


    private static int x = 100;

    public static int aMethod(int i)throws Exception
    {
        try{
            return i / 10;
        }
        catch (Exception ex)
        {
            throw new Exception("exception in a Method");
        } finally{
            System.out.printf("finally");
        }
    }

    public static void main(String []args){
//        int []arr = {1,2,3,4,5};
//        Solution solution = new Solution();
//        solution.oddInOddEvenInEven(arr);
//        System.out.println(val);
        Integer i01 = 59;
        int i02 = 59;
        Integer i03 =Integer.valueOf(59);
        Integer i04 = new Integer(59);

//        System.out.println(i04 == i03);

        Solution hs1=new Solution();
        hs1.x++;
        Solution  hs2=new Solution();
        hs2.x++;
        hs1=new Solution();
        hs1.x++;
        Solution.x--;
//        System.out.println("x="+x);

        try
        {
            aMethod(0);
        }
        catch (Exception ex)
        {
            System.out.printf("exception in main");
        }
        System.out.printf("finished");
    }
}
