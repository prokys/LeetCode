package org.prokys.p404;

import org.prokys.utils.TreeNode;

public class P404 {

    static int sum;

    public static int sumOfLeftLeaves(TreeNode root) {

        sum = 0;

        if (root == null){
            return 0;
        }

        if (root.left == null && root.right == null){
            return 0;
        }

        recurse(root, "start");

        return sum;
    }

    public static void recurse(TreeNode node, String direction){

        if (node.left !=null){
            recurse(node.left, "left");
        }
        if (node.right != null){
            recurse(node.right, "right");
        }
        if (node.left == null && node.right == null && direction.equals("left")){
            sum = sum + node.val;
        }
    }

}
