optimized solution:
如A = [4,5,6,7, 0, 1, 2]
二分查找 找到数组中最小的元素下标rot = 4

然后这个realm = (m + rot) 是怎么情况 我看不懂了


网上其他解法：

    public class Solution {
        public int search(int[] A, int target) {
	        if (A == null || A.length == 0) return -1;
	        int left = 0;
	        int right = A.length - 1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (A[mid] == target) {
	                return mid;
	            } 
	            if (A[left] <= A[mid]) {
	                if (A[left] <= target && target < A[mid]) {
	                    right = mid - 1;
	                } else {
	                    left = mid + 1;
	                }
	            } else {
	                if (A[mid] < target && target <= A[right]) {
	                    left = mid + 1;
	                } else {
	                    right = mid - 1;
	                }
	            }
	        }
	        return -1;
        }
    }

