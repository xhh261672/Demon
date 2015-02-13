import java.util.*;

/**
 * Created by Administrator on 2015/2/12.
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> re = new ArrayList<List<Integer>>();
        if (root == null) return re;

        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int level = queue.size();
            List<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < level; i++){
                TreeNode cur = queue.poll();
                temp.add(cur.val);
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
            }
            re.add(temp);
        }

        return re;
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> re = new ArrayList<List<Integer>>();
        if (root == null) return re;

        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int level = queue.size();
            List<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < level; i++){
                TreeNode cur = queue.poll();
                temp.add(cur.val);
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
            }
            re.add(temp);
        }

        Collections.reverse(re);
        return re;
    }
}
