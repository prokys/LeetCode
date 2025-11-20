package org.prokys.p203;

import org.prokys.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class P203 {

    public static List<Integer> numbers;

    public static ListNode removeElements(ListNode head, int val) {

        if (head == null){
            return null;
        } else if (val == 0) {
            return head;
        }

        ListNode node = new ListNode();
        numbers = new ArrayList<>();
        getVal(head, val);
        if (numbers.isEmpty()){
            return null;
        }

        for (int i = numbers.size()-1; i >=0 ; i--) {
            if (i == numbers.size()-1){
                node = new ListNode(numbers.get(i));
            }else node = new ListNode(numbers.get(i), node);
        }
        return node;
    }

    public static void getVal(ListNode node, int val){
        if (node.val != val){
            numbers.add(node.val);
        }
        if (node.next != null){
            getVal(node.next, val);
        }
    }

}
