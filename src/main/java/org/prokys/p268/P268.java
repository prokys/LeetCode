package org.prokys.p268;

public class P268 {

    public static int missingNumber(int[] nums) {

        int arraySum = 0;
        int arrayLengthSum = 0;

        for (int i = 0; i < nums.length; i++){
            arraySum = arraySum+nums[i];
            arrayLengthSum = arrayLengthSum + i+1;
        }

        return arrayLengthSum-arraySum;
    }
}
