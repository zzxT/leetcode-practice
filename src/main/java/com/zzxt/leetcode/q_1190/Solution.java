package com.zzxt.leetcode.q_1190;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public String reverseParentheses(String s) {
        Deque<Character> stack = new LinkedList<>();
        List<Character> list = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == ')') {
                while (!stack.isEmpty() && stack.peek() != '('){
                    list.add(stack.pop());
                }
                stack.pop();

                list.forEach(stack::push);
                list.clear();
            } else {
                stack.push(temp);
            }
        }

        StringBuilder result  = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pollLast());
        }

        return result.toString();
    }
}