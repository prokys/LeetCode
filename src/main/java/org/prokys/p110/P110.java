package org.prokys.p110;

import static java.lang.Math.abs;
import org.prokys.utils.TreeNode;

public class P110 {

    public static int maxDepthIntLeft;
    public static int maxDepthIntRight;

    public static TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    public static TreeNode root1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15, new TreeNode(9), new TreeNode(7)), new TreeNode(8)));
    public static TreeNode root2 = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2, new TreeNode(3, new TreeNode(2), null), null));


    public static void main(String[] args) {

        System.out.println(isBalanced(root2));


    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }else {
            maxDepthIntLeft = 0;
            maxDepthIntRight = 0;

            getDepth(root.left,0);
            getDepth2(root.right,0);
            if (abs(maxDepthIntRight-maxDepthIntLeft) > 1){
                return false;
            }else {
                if (isBalanced(root.left) == false || isBalanced(root.right)== false){
                    return false;
                }else return true;
            }
        }

    }

    public static void getDepth(TreeNode root, int depth){
        depth++;
        if (root == null) {
            depth--;
            return;
        }

        if (depth > maxDepthIntLeft){
            maxDepthIntLeft = depth;
        }
        getDepth(root.left, depth);
        getDepth(root.right, depth);
    }

    public static void getDepth2(TreeNode root, int depth){
        depth++;
        if (root == null) {
            depth--;
            return;
        }

        if (depth > maxDepthIntRight){
            maxDepthIntRight = depth;
        }
        getDepth2(root.left, depth);
        getDepth2(root.right, depth);
    }
}
