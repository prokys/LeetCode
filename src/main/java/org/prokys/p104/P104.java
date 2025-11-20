package org.prokys.p104;

import org.prokys.utils.TreeNode;

public class P104 {
    public static int maxDepthInt = 0;
    public static TreeNode root = new TreeNode(1, null, new TreeNode(2));

    public static void main(String[] args) {
        System.out.println(maxDepth(root));
    }
    public static int maxDepth(TreeNode root) {
        maxDepthInt = 0;
        getDepth(root,0);
        return maxDepthInt;
    }

    public static void getDepth(TreeNode root, int depth){
        depth++;
        if (root == null) {
            depth--;
            return;
        }

        if (depth > maxDepthInt){
            maxDepthInt = depth;
        }
        getDepth(root.left, depth);
        getDepth(root.right, depth);
    }



}
