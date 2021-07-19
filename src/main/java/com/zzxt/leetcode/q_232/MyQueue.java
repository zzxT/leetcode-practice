package com.zzxt.leetcode.q_232;

import java.util.Iterator;
import java.util.Stack;

class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> stackOne;
    Stack<Integer> stackTwo;
    public MyQueue() {
        stackOne = new Stack<>();
        stackTwo = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stackOne.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stackTwo.isEmpty()){
            Iterator<Integer> iterator = stackOne.iterator();
            while (iterator.hasNext()){
                stackTwo.push(stackOne.pop());
            }
        }

        return stackTwo.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if (stackTwo.isEmpty()) {
            Iterator<Integer> iterator = stackOne.iterator();
            while (iterator.hasNext()){
                stackTwo.push(stackOne.pop());
            }
        }

        return stackTwo.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackOne.isEmpty() && stackTwo.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */