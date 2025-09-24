package org.prokys.p111;

public class P111 {

    public static int minDepthInt;
    public static TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    public static TreeNode root1 = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null), null);
    public static TreeNode root2 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

    public static void main(String[] args) {
        System.out.println(minDepth(root));
        System.out.println(minDepth(root1));
        System.out.println(minDepth(root2));
    }
    public static int minDepth(TreeNode root) {
        minDepthInt = 999;
        getDepth(root,0);
        if (minDepthInt == 999){
            return 0;
        }else return minDepthInt;
    }

    public static void getDepth(TreeNode root, int depth){
        depth++;
        if (root == null) {
            depth--;
            return;
        }
        if (depth < minDepthInt && root.left == null && root.right == null){
            minDepthInt = depth;
        }
        getDepth(root.left, depth);
        getDepth(root.right, depth);
    }
}
