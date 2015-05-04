/**
 * Created by Administrator on 2015/5/4.
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        if (n <= 0) return null;
        return convert(new TreeNode(0), nums, 0, n-1);
    }

    private TreeNode convert(TreeNode root, int[]nums, int l, int r){
//        System.err.println(l + " " + r);
//        System.err.println(l==r);
        if (l > r) return null;
        if (l == r){
            root.val = nums[l];
            return root;
        }
        root.val = nums[(l+r)/2];
        root.left =  convert(new TreeNode(0), nums, l, (r+l)/2-1);
        root.right = convert(new TreeNode(0), nums, (r+l)/2+1, r);
        return root;
    }

    public static void main (String []args){
        Solution solution = new Solution();
        solution.sortedArrayToBST(new int[]{-1,0,1,2});
    }
}
