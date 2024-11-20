package org.prokys.p2461;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2461 {
    static int nums[] = {1,5,4,2,9,9,9};
    static int k = 3;

    public static void main(String[] args) {
//        System.out.println(maximumSubarraySum(nums,k));
        System.out.println(maximumSubarraySum1(nums,k));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        long finalNumber = 0;
        ArrayList<ArrayList<Integer>> arrayListsOfNumbers = new ArrayList<>();

        for (int i = 0; i<(i+k)&&i<nums.length-k+1; i++){
            ArrayList<Integer> arrayListOfNumbers = new ArrayList<>();

            for (int y = i; y < i+k; y++){
                if(arrayListOfNumbers.contains(nums[y])){
                    arrayListOfNumbers.clear();
                    break;
                }
                arrayListOfNumbers.add(nums[y]);
            }
            arrayListsOfNumbers.add(arrayListOfNumbers);
        }

        for (ArrayList<Integer> list : arrayListsOfNumbers){
            long sum = 0;
            for(int number : list){
                sum = sum+number;
            }
            if (sum>finalNumber){
                finalNumber = sum;
            }
        }
        return finalNumber;
    }
    public static long maximumSubarraySum1(int[] nums, int k) {
        long finalNumber = 0;
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        List<List<Integer>> listOfLists = new ArrayList<>();

        for (int i = 0; i < list.size()-k+1; i++) {
            listOfLists.add(list.subList(i,i+k));
        }

        for (List<Integer> listOfList : listOfLists) {
            int number = 0;
            for (int i = 0; i<listOfList.size(); i++) {
                if (listOfList.indexOf(listOfList.get(i)) != i){
                    number = 0;
                    break;
                } else {
                    number = number+listOfList.get(i);
                }
            }
            if (number > finalNumber){
                finalNumber = number;
            }
        }

        return finalNumber;
    }
}
