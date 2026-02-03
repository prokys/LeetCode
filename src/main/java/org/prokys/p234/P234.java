package org.prokys.p234;

import org.prokys.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class P234 {

    public static boolean isPalindrome(ListNode head) {

        List<Integer> nums = getNumbers(head);
        System.out.println(nums);

        if (nums.size() == 1) return true;

        for (int i = 0; i < nums.size()/2; i++) {
            if (nums.get(i) != nums.get(nums.size()-i-1)){
                return false;
            }
        }

        return true;
    }

    public static List<Integer> getNumbers(ListNode head){

        List<Integer> nums = new ArrayList<>();
        ListNode node = head;
        do {
            nums.add(node.val);
            node = node.next;

        }while (node != null);
        return nums;
    }
}
