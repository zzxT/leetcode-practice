package com.zzxt.leetcode.q_155;

import java.util.*;

class MinStack {

    /**
     * initialize your data structure here.
     */

    Deque<Integer> min;
    Deque<Integer> stack;
    public MinStack() {
        min = new LinkedList<>();
        stack = new LinkedList<>();

    }

    public void push(int val) {
        stack.push(val);

        Integer peek = min.peek();

        if (peek != null && peek >= val){
            min.push(val);
        }

        if (peek == null){
            min.push(val);
        }

    }

    public void pop() {

        if (stack.isEmpty()){
            return;
        }

        Integer pop = stack.pop();

        Integer peek = min.peek();

        if (pop.equals(peek)){
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek() == null ? 0: min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */