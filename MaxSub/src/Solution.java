import java.util.Stack;

/**
 * Created by Administrator on 2015/4/1.
 */
public class Solution {
    public int maxsub(TreeNode root){
        if (root == null) return 0;
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
//        stack.push(cur);
        int min = 0, max = 0;
        while (cur != null && !stack.isEmpty()){
            while(cur != null){
                if (cur.val < min) min = cur.val;
                if (cur.val > max) max = cur.val;
                stack.push(cur);
                cur = cur.left;
            }
            if (!stack.isEmpty()){
                cur = stack.pop();
                stack.push(cur);
                cur = cur.right;
            }
        }
        return Math.abs(max-min);
    }
}
