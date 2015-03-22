/**
 * Created by Administrator on 2015/3/22.
 */
public class Solution{
    public void merge(int A[], int m, int B[], int n) {
        int []C = new int[m+n];
        int i = 0, j = 0;
        int k = 0;
        while (i < m && j < n){
            if (A[i] <= B[j]){
                C[k] = A[i];
                k++; i++;
            }else{
                C[k] = B[j];
                k++; j++;
            }
        }
        if (i < m){
            for (int s = i; s < m; s++){
                C[k++] = A[s];
            }
        }
        if (j < n){
            for (int s = j; s < n; s++)
                C[k++] = B[s];
        }
        for (int s = 0; s < m+n; s++){
            A[s] = C[s];
        }
    }

    public void merge2(int []A, int m, int []B, int n){
        int k = m+n-1;
        int i = m-1, j = n-1;
        for (; k >= 0; k--){
            if (j < 0) break;
            if (i >= 0 && B[j] <= A[i]){
                A[k] = A[i]; i--;
            }else{
                A[k] = B[j]; j--;
            }
        }
    }

    public void merge3(int []A, int m, int []B, int n){
    	int i = m-1, j = n-1, k = m+n-1;
    	while (k >= 0){
    		if (j < 0) break;
    		if (i >= 0){
    			if (A[i] <= B[j]) A[k--] = B[j--];
    			else A[k--] = A[i--];
    		}else{
    			A[k--] = B[j--];
    		}
    	}
    }

    public static void main (String []args){
        int []A = new int[4];
        A[0] = 1; A[1] = 3;
        int []B = new int[2];
        B[0] = 2; B[1] = 4;
        Solution solution = new Solution();
        solution.merge(A, 4, B, 2);
    }
}
