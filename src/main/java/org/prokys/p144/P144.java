package org.prokys.p144;

import java.util.ArrayList;
import java.util.List;
import org.prokys.utils.TreeNode;

public class P144 {

    public static List<Integer> values = new ArrayList<>();
    public static TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
    public static TreeNode root1 = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7))), new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null)));

    public static void main(String[] args) {
        System.out.println(preorderTraversal(root));
        System.out.println(preorderTraversal(root1));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        values = new ArrayList<>();
        getList(root);
        return values;
    }

    private static void getList(TreeNode root) {
        if (root == null) return;
        values.add(root.val);
        getList(root.left);
        getList(root.right);
    }
}
