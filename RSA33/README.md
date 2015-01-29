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

此方法全程二分搜索 比起discuss里面某答案更让我清爽 

每一次总体分三种情况
1 A[mid] = target 就说找到了 返回mid 其他情况也就是A[mid] != target
2 A[mid] >= A[left] 意思是中间这个大于等于左边界那个 说明mid落在了那个pivot前面 这时又分两种情况
    - target大于等于左边界且小于中间那个 这说明target在[left, mid - 1]这个递增区间内 ->right = mid - 1
    - target在另外一个区间内 -> left = mid + 1

3 A[mid] < A[left] 中间这个竟然小于左边界那个 说明mid落在了那个pivot右侧 继续分两种情况
    - target 小于等于右边界且大于中间那个mid 说明target在[mid + 1， right]内 left = mid + 1
    - target不在那个递增区间里 就去找 [left, mid - 1] right = mid -1

    
