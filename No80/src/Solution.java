/**
 * Created by Administrator on 2015/2/8.
 */
public class Solution {
    public int removeDuplicates(int[] A) {
        int n = A.length;
        if (n == 0 || n == 1 || n == 2) return n;
        int i = 0, j = 0;
        while(i < n){
//            System.out.println(i + " " + j);
            A[j] = A[i];
            if (i+1 == n){
                j++; break;
            }

            else if (A[j] != A[i+1]){
                j++;i++;
            }
            else if (i+2 < n && A[j] != A[i+2]){
                A[j+1] = A[i+1];
                j+=2; i += 2;
            }
            else if (i+2 == n){
                i++; j++;
            }
            else i++;
        }

        return j;
    }

    public int removeDuplicates2(int []A){
        int n = A.length;
        if (n <= 2) return n;
        int len = 2, iter = 2;
        while (iter < n){
            if (A[iter] != A[len-2]) A[len++] = A[iter];
            iter++;
        }

        return len;
    }

    public static void main(String []args){
        Solution solution = new Solution();
        int []a = {1,2,2};
        solution.removeDuplicates(a);
    }
}
