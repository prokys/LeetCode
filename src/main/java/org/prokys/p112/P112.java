package org.prokys.p112;

public class P112 {

    public static int sum;
    public static TreeNode root = new TreeNode(1,new TreeNode(2), new TreeNode(3));

    public static void main(String[] args) {
        System.out.println(hasPathSum(root, 3));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        sum = 0;
        return getSum(root, targetSum) == true;
    }

    public static boolean getSum(TreeNode root, int targetSum){
        sum = sum + root.val;
        if (sum == targetSum && root.left == null && root.right == null){
            return true;
        }else{
            if (root.left != null && getSum(root.left, targetSum) == true){
                return true;
            }
            if (root.right !=null && getSum(root.right, targetSum) == true){
                return true;
            }
            sum = sum - root.val;
            return false;
        }
    }
}
