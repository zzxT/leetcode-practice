package com.zzxt.leetcode.q_739;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        Deque<Pair<Integer, Integer>> stack = new LinkedList<>();

        for (int i = 0; i < temperatures.length; i++) {
            if (!stack.isEmpty()) {

                while (!stack.isEmpty() && stack.peek().getKey() < temperatures[i]) {
                    result[stack.peek().getValue()] = i - stack.peek().getValue();
                    stack.pop();
                }

            }
            stack.push(new Pair<>(temperatures[i], i));
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}