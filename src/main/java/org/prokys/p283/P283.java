package org.prokys.p283;

public class P283 {

    public static void moveZeroes(int[] nums) {

        int numberOfZeros = 0;
        int[] numsWithoutZero = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0){
                numberOfZeros++;
                numsWithoutZero[nums.length-numberOfZeros] = 0;
            }else {
                numsWithoutZero[i-numberOfZeros] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsWithoutZero[i];
        }

    }

}
