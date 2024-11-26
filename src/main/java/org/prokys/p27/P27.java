package org.prokys.p27;

import java.util.Arrays;

public class P27 {

    public static void main(String[] args) {

        int[] nums = {3,2,2,3};
        int val = 3;

        removeElement(nums, val);


    }


    public static int removeElement(int[] nums, int val) {

        int [] array = Arrays.stream(nums).filter(value -> value != val).toArray();

        for (int i = 0; i < array.length; i++) {
            nums[i] = array[i];
        }

        return array.length;
    }
}
