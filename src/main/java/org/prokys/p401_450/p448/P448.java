package org.prokys.p401_450.p448;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class P448 {

//    public static List<Integer> findDisappearedNumbers(int[] nums) {
//
//        List<Integer> result = new ArrayList<>();
//
//        for (int i = 1; i <= nums.length; i++) {
//            boolean hasNum = false;
//            for (int num : nums) {
//                if (i == num) {
//                    hasNum = true;
//                    break;
//                }
//            }
//            if (!hasNum){
//                result.add(i);
//            }
//        }
//
//        return result;
//    }
//}

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 1; i <= nums.length ; i++) {
            set.add(i);
        }

        for (int num : nums) {
            set.remove(num);
        }

        return set.stream().toList();
    }
}
