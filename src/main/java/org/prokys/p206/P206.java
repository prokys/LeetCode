package org.prokys.p206;

import org.prokys.utils.ListNode;

public class P206 {

    public static ListNode newNode;

    public static ListNode reverseList(ListNode head) {

        newNode = null;
        if (head == null || head.next == null){
            return head;
        }else {
            getNode(head);
        }

        return newNode;
    }

    public static void getNode(ListNode node){

        newNode = new ListNode(node.val, newNode);
        if (node.next != null) getNode(node.next);
    }
}
