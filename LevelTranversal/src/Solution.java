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

    public List<List<Integer>> levelOrderBottom2(TreeNode root){
        LinkedList<List<Integer>> re = new LinkedList<List<Integer>>();
        if (root == null) return re;

        List<TreeNode> temp = new ArrayList<TreeNode>();

        temp.add(root);
        while (true){
            System.out.println(re);
            if (temp == null || temp.isEmpty()) return re;
            List<Integer> list = new ArrayList<Integer>();
            List<TreeNode> next = new ArrayList<TreeNode>();
            for (TreeNode iter : temp){
                list.add(iter.val);
                if (iter.left != null) next.add(iter.left);
                if (iter.right != null) next.add(iter.right);
            }
            re.addFirst(list); // List<E> interface donot have addFirst() method
//            list.clear(); //不要clear 这里一clear re里面的也被清了 引用？

            temp = next;
        }
    }

    public static void main(String []args){
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        List<List<Integer>> re = solution.levelOrderBottom2(root);
//        System.out.println(re);
    }
}
