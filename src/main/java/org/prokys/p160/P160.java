package org.prokys.p160;

import java.util.ArrayList;
import java.util.List;
import org.prokys.utils.ListNode;

public class P160 {

    public static List<ListNode> list1;
    public static List<ListNode> list2;

    public static ListNode commonNode = new ListNode(8, new ListNode(4, new ListNode(5)));
    public static ListNode node1 = new ListNode(4, new ListNode(1, commonNode));
    public static ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(1, commonNode)));

    public static void main(String[] args) {

        System.out.println(getIntersectionNode(node1, node2));
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        getNodes(headA, list1);
        getNodes(headB, list2);

        for (int i = 0; i < list1.size() ; i++) {
            if (list2.contains(list1.get(i))){

                return list1.get(i);
            }
        }

        return null;
    }

    public static ListNode getNodes(ListNode node, List<ListNode> inputList){
        if (node.next != null){
            inputList.add(node);
            getNodes(node.next, inputList);
            return node;
        }else {
            inputList.add(node);
            return node;
        }
    }
}
