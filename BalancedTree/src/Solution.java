/**
 * Created by Administrator on 2015/5/28.
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        if (Math.abs(subHeight(root.left, 2)-subHeight(root.right, 2)) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int subHeight(TreeNode root, int h){
        if (root == null) return h-1;
        return Math.max(subHeight(root.left, h+1), subHeight(root.right, h+1));
    }
}
