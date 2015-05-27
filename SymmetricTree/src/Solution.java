import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/5/27.
 */
public class Solution {
//    List<Integer> list = new ArrayList<Integer>();

//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) return true;
//        genList(root);
//        int i = 0, j = list.size()-1;
//        while (i < j){
//            if (list.get(i) != list.get(j)) return false;
//            i++; j--;
//        }
//        return true;
//    }
//
//    private void genList(TreeNode root){
//        if (root == null) return;
//        genList(root.left);
//        list.add(root.val);
//        genList(root.right);
//    }

    public boolean isSymmetric (TreeNode root){
        if (root == null) return true;

        return isSym(root.left, root.right);
    }

    private boolean isSym(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;

        return (isSym(left.left, right.right) && isSym(left.right, right.left));
    }
}
