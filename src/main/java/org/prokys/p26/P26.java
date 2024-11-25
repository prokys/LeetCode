package org.prokys.p26;

import java.util.ArrayList;
import java.util.List;

public class P26 {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates1(nums));
    }

    public static int removeDuplicates(int[] nums) {

        List<Integer> numbers = new ArrayList<>();

        for (int num : nums) {
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }

        int numberOfElements = numbers.size();

        for (int i = 0; i < numberOfElements; i++) {
            nums[i] = numbers.get(i);
        }

        return numberOfElements;
    }

    public static int removeDuplicates1(int[] nums) {

        List<Integer> numbers = new ArrayList<>();
        int numberOfElements = 0;

        for (int num : nums) {
            if (!numbers.contains(num)) {
                numbers.add(num);
                nums[numberOfElements] = num;
                numberOfElements ++;
            }
        }

        return numberOfElements;
    }

}
