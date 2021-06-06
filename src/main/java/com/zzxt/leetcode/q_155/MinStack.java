//package com.zzxt.leetcode.q_155;
//
//import java.util.*;
//
//class MinStack {
//
//    /**
//     * initialize your data structure here.
//     */
//    private LinkedList<Integer> data = new LinkedList<>();
//    private Map<>
//    int min = Integer.MIN_VALUE;
//
//    public MinStack() {
//
//    }
//
//    public void push(int val) {
//        min = Math.min(min, val);
//        data.add(val);
//    }
//
//    public void pop() {
//        data.pop();
//    }
//
//    public int top() {
//        return data.pop();
//    }
//
//    public int getMin() {
//
//    }
//}
//
///**
// * Your MinStack object will be instantiated and called as such:
// * MinStack obj = new MinStack();
// * obj.push(val);
// * obj.pop();
// * int param_3 = obj.top();
// * int param_4 = obj.getMin();
// */