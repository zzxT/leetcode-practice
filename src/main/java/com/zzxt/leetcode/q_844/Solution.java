package com.zzxt.leetcode.q_844;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean backspaceCompare(String s, String t) {

        Deque<Character> first = new ArrayDeque<Character>(s.length());
        Deque<Character> second = new ArrayDeque<Character>(t.length());

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (!first.isEmpty() && temp == '#') {
                first.pop();
            } else {
                if (first.isEmpty() && temp == '#'){
                    continue;
                }
                first.push(temp);
            }
        }


        for (int i = 0; i < t.length(); i++) {
            char temp = t.charAt(i);
            if (!second.isEmpty() && temp == '#') {
                second.pop();
            } else {
                if (second.isEmpty() && temp == '#'){
                    continue;
                }
                second.push(temp);
            }
        }


        if (first.size() != second.size()) {
            return  false;
        }

        while (!first.isEmpty()) {
            if (first.pop() != second.pop()) {
                return false;
            }
        }

        return true;

    }
}