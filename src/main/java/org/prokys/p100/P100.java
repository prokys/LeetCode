package org.prokys.p100;

import java.util.ArrayList;
import java.util.List;
import org.prokys.utils.TreeNode;

public class P100 {

    public static TreeNode root = new TreeNode(2, new TreeNode(1), null);
    public static TreeNode root2 = new TreeNode(1, null, new TreeNode(2));
    public static List<Integer> values;
    public static List<Integer> values2;

    public static void main(String[] args) {

        System.out.println(isSameTree(root, root2));
        System.out.println(isSameTree(root, root));
        System.out.println(isSameTree(root2, root2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        values = new ArrayList<>();
        values2 = new ArrayList<>();
        getList(p);
        getList2(q);

        return values.equals(values2);
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
        getList2(root.left);
        getList2(root.right);
    }
}
