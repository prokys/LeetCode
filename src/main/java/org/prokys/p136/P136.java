package org.prokys.p136;

import java.util.*;

public class P136 {

    public static int[] array = {1,2,2};
    public static int[] array1 = {3,2,2,5,3,5,1,1,9};
    public static int[] array2 = {1,2,2,1,6,6,8,7,7,9,9};

    public static void main(String[] args) {

        System.out.println(singleNumber(array));
        System.out.println(singleNumber(array1));
        System.out.println(singleNumber(array2));


    }

    public static int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])){
                list.remove(Integer.valueOf(nums[i]));
            } else list.add(nums[i]);
        }
        return list.get(0);
    }

}
