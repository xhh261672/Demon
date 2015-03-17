import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * Created by Administrator on 2015/3/16.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

 public class Solution {
     public boolean hasPathSum2(TreeNode root, int sum) {
        if (root == null) return false;
        int treeSum = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> tmpsum = new Stack<Integer>();
        TreeNode cur = root;
        stack.push(root);
//         treeSum += cur.val;
         tmpsum.push(treeSum);
        while (!stack.isEmpty()){
            treeSum += cur.val;
            if (cur.left == null && cur.right == null){
                if (treeSum == sum) return true;
            }
            if (cur.right != null){
                stack.push(cur.right);
                tmpsum.push(treeSum);
            }
            if (cur.left != null){
                cur = cur.left;
            }else{
                cur = stack.pop(); treeSum = tmpsum.pop();
            }
        }
        return false;
     }

     public boolean hasPathSum(TreeNode root, int sum) {
         if (root == null) return false;
         if (root.left == null && root.right == null){
             return root.val == sum;
         }else
             return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);

     }

     public  static void main(String []args) {
         Solution solution = new Solution();
         TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         solution.hasPathSum(root, 0);
     }
 }
