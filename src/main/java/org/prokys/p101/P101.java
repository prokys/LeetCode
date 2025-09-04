package org.prokys.p101;

import java.util.ArrayList;
import java.util.List;

public class P101 {
    public static List<Integer> values;
    public static List<Integer> values2;
    public static TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(2));
    public static TreeNode root2 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
    public static TreeNode root3 = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), new TreeNode(2, null, new TreeNode(3)));

    public static void main(String[] args) {

        System.out.println(isSymmetric(root));
        System.out.println(isSymmetric(root2));
        System.out.println(isSymmetric(root3));

    }

    public static boolean isSymmetric(TreeNode root) {
        values = new ArrayList<>();
        values2 = new ArrayList<>();
        getList(root2);
        getList2(root2);
        if (values.equals(values2)){
            return true;
        }else return false;
    }

    private static void getList(TreeNode root) {
        if (root == null) {
            values.add(null);
            return;
        }
        values.add(root.val);
        getList(root.left);
        getList(root.right);
    }
    private static void getList2(TreeNode root) {
        if (root == null) {
            values2.add(null);
            return;
        }
        values2.add(root.val);
        getList2(root.right);
        getList2(root.left);
    }
}
