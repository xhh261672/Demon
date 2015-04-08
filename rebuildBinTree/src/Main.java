import java.util.Scanner;

/**
 * Created by Administrator on 2015/4/8.
 */
public class Main {
    private static int []pre;
    private static int []in;
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n <= 0) return;
            pre = new int[n];
            in = new int[n];
            for (int i = 0; i < n; i++)
                pre[i] = sc.nextInt();
            for (int i = 0; i < n; i++){
                in[i] = sc.nextInt();
            }
            TreeNode root = new TreeNode(0);
            try {
                root = construct(0, n-1, 0, n-1);
            }catch (Exception e){
                System.out.print("No");
//                return;
            }
            postPrint(root);
            System.out.print('\n');
        }
    }
    private static TreeNode construct(int preStart, int preEnd, int inStart, int inEnd) throws Exception{
        int rootVal  = pre[preStart];
        TreeNode root =  new TreeNode(rootVal);
        if (preStart == preEnd){
            if (inStart == inEnd && pre[preStart] == in[inStart])
                return root;
            else{
                throw new Exception();
            }
        }
        int inRoot = inStart;
        while (inRoot < inEnd && in[inRoot] != rootVal)
            inRoot++;
        if (inRoot == inEnd && in[inRoot] != rootVal)
            throw new Exception();
        int lsublength = inRoot - inStart;
        if (lsublength > 0){
            root.left  = construct(preStart+1, preStart+lsublength, inStart, inRoot-1);
        }
        if (preStart + lsublength < preEnd){
            root.right = construct(preStart+lsublength+1, preEnd, inRoot+1, inEnd);
        }

        return root;
    }

    private static void postPrint(TreeNode root){
        if (root == null || root.val == 0) return;
        postPrint(root.left);
        postPrint(root.right);
        System.out.print(root.val+" ");
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}