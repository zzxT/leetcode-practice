package com.zzxt.leetcode.q_1021;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String removeOuterParentheses(String s) {

        int level = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' && level++  > 0 ){
                result.append(s.charAt(i));
            } else if (s.charAt(i) == ')' && level-- > 1) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}