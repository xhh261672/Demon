import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * Created by Administrator on 2015/4/2.
 */
public class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.left);
        flatten(root.right);

        TreeNode r = root.right;

        if (root.left != null){
            root.right = root.left;
            root.left = null;
            while (root.right != null)
                root = root.right;
            root.right = r;
        }
    }


}