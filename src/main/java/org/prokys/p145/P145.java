package org.prokys.p145;

import java.util.ArrayList;
import java.util.List;

public class P145 {

    public static List<Integer> values = new ArrayList<>();
    public static TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
    public static TreeNode root1 = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7))), new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null)));


    public static void main(String[] args) {

        System.out.println(postorderTraversal(root));
        System.out.println(postorderTraversal(root1));

    }

    public static List<Integer> postorderTraversal(TreeNode root) {
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
        getList(root.right);
        values.add(root.val);
    }
}
