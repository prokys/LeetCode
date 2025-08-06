package org.prokys.p83;

import java.util.ArrayList;
import java.util.List;

public class P83 {
    public static void main(String[] args) {
//        ListNode node = new ListNode(1,new ListNode(1, new ListNode(2)));
        ListNode node = new ListNode(1);

        deleteDuplicates(node);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode();
        List<Integer> values = new ArrayList<>();
        if (head != null){
            do {
                if (!values.contains(head.val)){
                    values.add(head.val);
                }
                head = head.next;
            }while (head != null);

            for (int i = values.size()-1; i >= 0 ; i--) {
                if (values.size()-1 == i){
                    result = new ListNode(values.get(i));
                }else {
                    result = new ListNode(values.get(i), result);
                }
            }
            return result;
        }else {
            return head;
        }
    }
}
