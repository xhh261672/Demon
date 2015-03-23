import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

     //my fucking TLE code:

     public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> re = new ArrayList<List<Integer>>();
        if (root == null) return re;
        int treesum = 0;
         Stack<TreeNode> treeStack = new Stack<TreeNode>();
         Stack<Integer> sumStack = new Stack<Integer>();

         TreeNode cur = root;
         treeStack.push(cur); sumStack.push(treesum);

         List<Integer> temp = new LinkedList<Integer>();

         while (!treeStack.isEmpty()){
            treesum += cur.val;
             temp.add(cur.val);
             if (cur.left == null && cur.right == null){
                 if (treesum == sum){
                    List<Integer> reList = new LinkedList<Integer>(temp);
                    re.add(reList);
                 }
             }
             if (cur.right != null){
                 treeStack.push(cur.right);
                 sumStack.push(treesum);
             }
             if (cur.left != null){
                 cur = cur.left;
             }else{
                 cur = treeStack.pop();
                 treesum = sumStack.pop();
                 temp.remove(temp.size()-1);
             }
         }
//        System.out.println(re);
         return re;

     }

     ////////////////////////////////////////////////

     public List<List<Integer>> re = new ArrayList<List<Integer>>();
     public List<List<Integer>> pathSum2(TreeNode root, int sum){
         if (root == null) return re;
         List<Integer> tempList = new ArrayList<Integer>();
         getsum(root, 0, sum, tempList);

         return re;
     }

     public  void getsum(TreeNode root, int temp, int sum, List<Integer> list){
         if (root == null) return;
         temp += root.val;
         list.add(root.val);

         if (root.left == null && root.right == null && temp == sum){
             re.add(new ArrayList<Integer>(list));
         }else{
             getsum(root.left, temp, sum, list);
             getsum(root.right, temp, sum, list);
         }
         list.remove(list.size()-1);
     }

     public  static void main(String []args) {
         Solution solution = new Solution();
         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
         solution.pathSum(root, 1);

//         int x = 0, y = 0;
//         int cnt = 0;
//         for (int i = 0; i < 500; i++){
//             x = i%6 + 1;
//             y = i%8 + 1;
//             if (x==y) cnt++;
//         }
//         System.out.print(cnt);
     }
 }
