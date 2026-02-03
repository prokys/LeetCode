package org.prokys.utils;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {

    static List<Integer> que;

    public MyQueue() {
        que = new ArrayList<>();
    }

    public void push(int x) {
        que.add(x);
    }

    public int pop() {
        int result = que.get(0);
        que.remove(0);
        return result;
    }

    public int peek() {
        return que.get(0);
    }

    public boolean empty() {
        return que.isEmpty();
    }
}
