import java.util.ArrayList;
import java.util.List;
/**
 * Created by Administrator on 2015/4/27.
 */
public class Solution {
    List<Integer> re = new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return re;
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            List<TreeNode> temp = new ArrayList<TreeNode>();
            re.add(nodes.get(nodes.size()-1).val);
            for (int i = 0; i < nodes.size(); i++){
                TreeNode node = nodes.get(i);
                if (node.left != null)
                    temp.add(node.left);
                if (node.right != null)
                    temp.add(node.right);
            }
            nodes = new ArrayList<TreeNode>(temp);
        }
        return re;
    }
}
