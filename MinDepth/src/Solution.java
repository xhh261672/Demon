/**
 * Created by Administrator on 2015/3/23.
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int depth = 0;
        depth = countDepth(root, ++depth);
        return depth;
    }
    public int countDepth(TreeNode root, int depth){
        if (root.left == null && root.right == null)
            return depth;
        else {
            depth++;
            if (root.left == null)
                return countDepth(root.right, depth);
            else if (root.right == null)
                return countDepth(root.left, depth);
            else{
                int ldepth = countDepth(root.left, depth);
                int rdepth = countDepth(root.right, depth);
//                System.out.println(ldepth + " " + rdepth);
                return ldepth <= rdepth? ldepth: rdepth;
            }
        }
    }

    public static void main (String []args){
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2), n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4), n5 = new TreeNode(5);
        root.left = n2;
        root.right = n3;
        n2.left = n4; n2.right = n5;
        solution.minDepth(root);
    }
}
