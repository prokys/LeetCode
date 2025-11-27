package org.prokys.p21;

import org.prokys.utils.ListNode;

import java.util.Arrays;

public class P21 {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.println("listNode = " + Arrays.toString(ListNode.toArray(listNode)));
        System.out.println("listNode2 = " + Arrays.toString(ListNode.toArray(listNode2)));

        System.out.println(Arrays.toString(ListNode.toArray(mergeTwoLists(listNode, listNode2))));

    }

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {


            if (list1 == null && list2 == null){
                return null;
            } else if (list1 == null) {
                return list2;
            }else if (list2 == null){
                return list1;
            }

            ListNode listNode;
            int firstNode = list1.val;
            int secondNode = list2.val;

            if (firstNode < secondNode){
                listNode = new ListNode(firstNode, mergeTwoLists(list1.next, list2));
            } else if (secondNode < firstNode){
                listNode = new ListNode(secondNode, mergeTwoLists(list1, list2.next));
            } else if (firstNode == secondNode){
                listNode = new ListNode(firstNode, mergeTwoLists(list1.next, list2));
            } else {
                return new ListNode();
            }

            return listNode;
        }

}
