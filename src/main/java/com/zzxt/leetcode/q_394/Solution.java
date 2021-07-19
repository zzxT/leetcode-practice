package com.zzxt.leetcode.q_394;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public String decodeString(String s) {
        Deque<Character> stack = new LinkedList<>();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if (temp == ']') {
                String expr = "";
                while (!stack.isEmpty() && stack.peek() != '['){
                    expr = stack.pop() + expr;
                }
                stack.pop();

                String loop = "";
                while (!stack.isEmpty() && Character.isDigit(stack.peek())){
                    loop = stack.pop() + loop;
                }
                int times = Integer.parseInt(loop);

                for (int j = 0; j < times; j++) {
                    for (int k = 0; k < expr.length(); k++) {
                        stack.push(expr.charAt(k));
                    }
                }

            } else {
                stack.push(temp);
            }
        }


        while (!stack.isEmpty()) {
            result.append(stack.pollLast());
        }

        return result.toString();
    }

//
//    String decode(String expr, int times) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < times; i++) {
//            stringBuilder.append(expr);
//        }
//        return stringBuilder.toString();
//    }

    public static void main(String[] args) {
        System.out.println(new Solution().decodeString("3[a2[c]]"));
    }
}