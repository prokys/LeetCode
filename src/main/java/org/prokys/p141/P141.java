package org.prokys.p141;

import java.util.ArrayList;
import java.util.List;
import org.prokys.utils.ListNode;

public class P141 {

    public static List<ListNode> list = new ArrayList<>();

    public static void main(String[] args) {



    }

    public static boolean hasCycle(ListNode head) {

        if (head == null || head.next == null  ){
            return false;
        }else if (list.contains(head)){
            return true;
        }else {
            list.add(head);
            return hasCycle(head.next) == true;
        }

    }
}
