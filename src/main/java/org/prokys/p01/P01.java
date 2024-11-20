package org.prokys.p01;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class P01 {

    public static void main(String[] args) {
        int[] input = {-1,-2,-3,-4,-5};
        int value = -8;

        twoSum(input,value);

    }

    public static int[] twoSum(int[] nums, int target) {

        int [] solution = new int[2];

        for (int i = 0; i < nums.length; i++) {

                int helper = target - nums[i];
                int position = findPosition(nums, helper);
                if(position >=0 && i!=position){
                    solution[0] = i;
                    solution[1] = position;
                    break;
                }

        }
        return solution;
    }
    public static int findPosition(int nums[], int target){
        for (int i = 0; i< nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
