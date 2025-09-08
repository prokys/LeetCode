package org.prokys.p108;

import java.util.Arrays;

public class P108 {

    public static int[] nums = {-10,-3,0,5,9};
    public static int[] nums1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    public static void main(String[] args) {
        System.out.println(sortedArrayToBST(nums).val);
//        System.out.println(sortedArrayToBST(nums1));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {

        int num = nums.length/2;

        if (num<2){
            if (nums.length == 3){
                return new TreeNode(nums[num], new TreeNode(nums[num-1]), new TreeNode(nums[num+1]));
            }else if (nums.length == 2){
                return new TreeNode(nums[num], new TreeNode(nums[num-1]), null);
            }else return new TreeNode(nums[num], null, null);
        }else {
            return new TreeNode(nums[num], sortedArrayToBST(Arrays.copyOfRange(nums,0, num)), sortedArrayToBST(Arrays.copyOfRange(nums,num+1,nums.length)));
        }

    }
}
