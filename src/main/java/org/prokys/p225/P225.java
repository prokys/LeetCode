package org.prokys.p225;

import java.util.ArrayList;
import java.util.List;


public class P225 {
    public static class MyStack {

        static List<Integer> que;


        public MyStack() {
            que = new ArrayList<>();
        }

        public void push(int x) {
            que.add(x);
        }

        public int pop() {
            int helper = que.get(que.size()-1);
            que.remove(que.size()-1);
            return helper;
        }

        public int top() {
            return que.get(que.size()-1);
        }

        public boolean empty() {
            if (que.isEmpty()) return true;
            return false;
        }
    }
}
