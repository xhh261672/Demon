/**
 * Created by Administrator on 2015/2/11.
 */
public class Solutio {

//    public static class TreeNode {
//             int val;
//             TreeNode left;
//             TreeNode right;
//             TreeNode(int x) { val = x; }
//    }

    private int sum = 0, num = 0;
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;

        adder(root);
        return sum;
    }

    private void adder(TreeNode node){
        if (node == null) return;
        if (node.left == null && node.right == null) {
            num = num*10 + node.val;
            sum += num;
            num /= 10;
            return;
        }
//        System.out.println(node.val);
        num = num*10 + node.val;
        adder(node.left);
        adder(node.right);
        num /= 10;
    }



// call sumNumbers(root, 0)
    public int sumNumbers(TreeNode root, int pathNum){
        if (root == null) return 0;
        pathNum  = pathNum*10 + root.val;

        if (root.left == null && root.right == null) return pathNum;

        return sumNumbers(root.left, pathNum) + sumNumbers(root.right, pathNum);
    }

    public static void main(String []args){
        Solutio s = new Solutio();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(s.sumNumbers(root));
    }
}
