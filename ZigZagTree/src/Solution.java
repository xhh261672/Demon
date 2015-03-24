
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2015/3/24.
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> re = new ArrayList<List<Integer>>();
        if (root == null) return re;

        List<TreeNode> curlevel = new ArrayList<TreeNode>();
        TreeNode cur = root;

        curlevel.add(root);
        boolean left = false;
        while (!curlevel.isEmpty()){
//            System.out.println(curlevel.size());
            List<TreeNode> nextlevel = new ArrayList<TreeNode>();
            List<Integer> reTemp = new ArrayList<Integer>();
            for (int i = curlevel.size()-1; i >= 0; i--){
                cur = curlevel.get(i);
                if (cur == null)
                    continue;
                reTemp.add(cur.val);
                if (left == true){
                    if (cur.right != null)
                        nextlevel.add(cur.right);
                    if (cur.left != null)
                        nextlevel.add(cur.left);
                }else{
                    if (cur.left != null)
                        nextlevel.add(cur.left);
                    if (cur.right != null)
                        nextlevel.add(cur.right);
                }
            }
            left  = !left;
            re.add(reTemp);
            curlevel = new LinkedList<TreeNode>(nextlevel);
        }
        return re;
    }

    public static void main(String []args){
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        solution.zigzagLevelOrder(root);
    }

}
