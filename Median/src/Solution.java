/**
 * Created by Administrator on 2015/3/7.
 */
public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        int m = A.length, n = B.length;
        int k = (m+n)/2 + 1;
//        System.out.println(k);
        double re = (double)findKth(A, 0, m-1, B, 0, n-1, k);

        if ((m+n)%2 == 0){
            double re2 = (double)findKth(A, 0, m-1, B, 0, n-1, k-1);
//            System.out.println(re2);
            re = (re + re2) /2;
        }
        return re;
    }

    public int findKth(int A[], int al, int ar, int B[], int bl, int br, int k){
        if (al > ar) return B[bl+k-1];
        if (bl > br) return A[al+k-1];

        int aMid = (al+ar)/2, bMid = (bl+br)/2;

        if (A[aMid] <= B[bMid]){
            if (k <= (aMid-al) + (bMid-bl) + 1) return findKth(A, al, ar, B, bl, bMid-1, k);
            else return findKth(A, aMid+1, ar, B, bl, br, k-(aMid-al)-1);
        }else{
            if (k <= (aMid-al) + (bMid-bl) + 1) return findKth(A, al, aMid-1, B, bl, br, k);
            else return findKth(A, al, ar, B, bMid+1, br, k-(bMid-bl)-1);
        }
    }

    public static void main(String []args){
        int []A = {1,2};
        int []B = {1,2};
        Solution solution = new Solution();
        solution.findMedianSortedArrays(A, B);
    }

}