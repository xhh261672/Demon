import java.util.ArrayList;
import java.util.Arrays;
import  java.util.List;
/**
 * Created by Administrator on 2015/4/1.
 */
public class Main {
    private static List<List<Integer>> permList = new ArrayList<List<Integer>>();
    public void permGen(Integer []arr, int k, int n){
        if (k == n-1){
            List<Integer> temp = new ArrayList<Integer>(Arrays.asList(arr));
            permList.add(temp);
            return;
        }else{
            for (int i = k; i < n; i++){
                int t = arr[k];
                arr[k] = arr[i];
                arr[i] = t;
                permGen(arr, k+1, n);
                t = arr[k];
                arr[k] = arr[i];
                arr[i] = t;
            }
        }
    }

    private void getPerm(int []a, int k, int n){

        if (k == n-1){
            List<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < n; i++){
                temp.add(a[i]);
            }
//            System.out.println(temp);
            permList.add(temp);
//
            return;
        }else{
            for (int i = k; i < n; i++){
                int t = a[k];
                a[k] = a[i]; a[i] = t;
                getPerm(a, k+1, n);
                t = a[k]; a[k] = a[i]; a[i] = t;
            }
        }
    }
    public List<List<Integer>> permute(int[] num) {
        permList.clear();
        getPerm(num, 0, num.length);

        return permList;
    }


    public void permute(int[] num, int idx){
        for(int i = idx; i < num.length; i++){
            int temp = num[i]; num[i] = num[idx]; num[idx] = temp;
            permute(num, idx+1);
            temp = num[i]; num[i] = num[idx]; num[idx] = temp;
        }
        if (idx == num.length -1){
            permList.add(convert(num));
        }
    }

    public List<Integer> convert(int[] num){
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<num.length;i++){
            res.add(num[i]);
        }
        return res;
    }

    public static void main(String []args){
        System.out.println(permList);
        Main m = new Main();
        m.permute(new int[]{0, 1});
        System.out.println(permList);
//        List<Integer> temp  = new ArrayList<Integer>();
//        Integer[] a = {1,2,3};
//        m.permGen(a, 0, 3);
//        System.out.print(permList);
//        int []num = {1,5,1};
//        m.nextPermutation(num);
//        System.out.print(num);
    }



    public void nextPermutation(int[] num) {
        int l = num.length;
        if (l == 1) return;
        int i = l-2, j = l-1, k = l-1;
        for (; i >= 0;i--, j--){
            if (num[i] < num[j])
                break;
        }
        if (i < 0){
            reverse(num, 0, num.length-1);
            return;
        }
        while (num[k] <= num[i])// 不能写< 要找的是比num[i]大的数字
            k--;
        int t = num[k];
        num[k] = num[i];
        num[i] = t;
        System.out.print(i+" "+j+" "+k);
        reverse(num, j, num.length-1);
    }
    public void reverse(int[] a, int l, int r){

        while (l < r){
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++; r--;
        }
    }
}
