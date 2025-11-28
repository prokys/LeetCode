package org.prokys.p222;

import org.prokys.utils.TreeNode;

public class P222 {

    public static int count;
    public static int countNodes(TreeNode root) {

        count = 0;

        getCount(root);

        return count;
    }

    private static void getCount(TreeNode node){
        if (node == null) return;
        getCount(node.left);
        count ++;
        getCount(node.right);
    }
}
