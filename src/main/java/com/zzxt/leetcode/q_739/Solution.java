package com.zzxt.leetcode.q_739;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    class Temp{
        int value;
        int index;

        public Temp(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }


    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Temp> stack = new LinkedList<>();

        if (temperatures.length == 1) {
            return new int[] {0};
        }

        int[] result = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                result[i] = 0;
                stack.push(new Temp(temperatures[i], i));
                continue;
            }

            if ( temperatures[i] < stack.peek().value) {
                result[i] = stack.peek().index - i;
                stack.push(new Temp(temperatures[i], i));
            } else {

                while (true) {

                    if (stack.isEmpty() ) {
                        stack.push(new Temp(temperatures[i], i));
                        result[i] = 0;
                        break;
                    }

                    if (temperatures[i] >= stack.peek().value) {
                        stack.pop();
                        continue;
                    }


                    if (stack.peek().value > temperatures[i]) {
                        result[i] = stack.peek().index - i;
                        stack.push(new Temp(temperatures[i], i));
                        break;
                    }
                }


            }
        }

        return result;
    }

    public static void main(String[] args) {
        new Solution().dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
    }
}