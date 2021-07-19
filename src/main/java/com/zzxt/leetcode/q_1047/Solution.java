package com.zzxt.leetcode.q_1047;

import java.sql.Statement;
import java.util.*;

class Solution {

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()){
                stack.push(chars[i]);
                continue;
            }

            Character last = stack.peek();
            if (last.equals(chars[i])){
                stack.pop();
                continue;
            }

            stack.push(chars[i]);
        }

        Iterator<Character> iterator = stack.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        while (iterator.hasNext()){
            stringBuilder.append(iterator.next());
        }

        return stringBuilder.toString();
    }

//    大佬的做法
//    public String removeDuplicates(String S) {
//        char[] s = S.toCharArray();
//        int top = -1;
//        for (int i = 0; i < S.length(); i++) {
//            if (top == -1 || s[top] != s[i]) {
//                s[++top] = s[i];
//            } else {
//                top--;
//            }
//        }
//        return String.valueOf(s, 0, top + 1);
//    }

}