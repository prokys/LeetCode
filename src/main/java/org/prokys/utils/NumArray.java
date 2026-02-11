package org.prokys.utils;

public class NumArray {

    int[] array;

    public NumArray(int[] nums) {
        array = nums;
    }

    public int sumRange(int left, int right) {

        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum = sum + array[i];
        }
        return sum;
    }


}
