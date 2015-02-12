import java.util.Stack;

/**
 * Created by Administrator on 2015/2/12.
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root, pre = null;
        while (!stack.isEmpty() || cur != null){
            if (cur != null){
                stack.push(cur);
                cur = cur.left;
            }else{
                TreeNode temp = stack.pop();
                if (pre != null && temp.val <= pre.val) return false;
                pre = temp;
                cur = temp.right;
            }
        }
        return true;
    }
}
