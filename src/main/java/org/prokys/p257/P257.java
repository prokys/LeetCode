package org.prokys.p257;

import org.prokys.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P257 {

    private static List<String> results;
    private static List<Integer> list;

    public static List<String> binaryTreePaths(TreeNode root) {

        results = new ArrayList<>();
        list  = new ArrayList<>();
        getPaths(root);

        System.out.println(results);

        return results;
    }

    public static void getPaths(TreeNode root){
        if (root == null) {
            return;
        }

        list.add(root.val);

        if (root.left == null && root.right == null) {
            results.add(createPath(list));
            list.remove(list.size()-1);
        }else {
            getPaths(root.left);
            getPaths(root.right);
            list.remove(list.size()-1);
        }

    }

    private static String createPath(List<Integer> list) {
        String result = Integer.toString(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            result = result.concat("->"+list.get(i));
        }

        return result;
    }
}
