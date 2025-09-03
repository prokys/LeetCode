package org.prokys.P94;

import java.util.ArrayList;
import java.util.List;

public class p94 {

    public static TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
    public static TreeNode root2 = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7))), new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null)));
    public static TreeNode root3 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, new TreeNode(5), null), new TreeNode(4)));
    public static List<Integer> values;
    public static void main(String[] args) {

        System.out.println(inorderTraversal(root3));

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        values = new ArrayList<>();
        getList(root);
        return values;
    }

    private static void getList(TreeNode root) {
        if (root == null) return;
        getList(root.left);
        values.add(root.val);
        getList(root.right);
    }
}
