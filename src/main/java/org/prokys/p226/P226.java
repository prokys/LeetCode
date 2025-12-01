package org.prokys.p226;

import org.prokys.utils.TreeNode;

public class P226 {

    public static TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        invert(root);

        return root;
    }

    public static void invert(TreeNode node){

        TreeNode left = node.left;
        node.left = node.right;
        node.right = left;

        if (node.left !=null){
            invert(node.left);
        }
        if (node.right != null){
            invert(node.right);
        }

    }

}
