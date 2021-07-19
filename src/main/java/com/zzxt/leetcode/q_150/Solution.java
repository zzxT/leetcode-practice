package com.zzxt.leetcode.q_150;

import java.util.Deque;
import java.util.LinkedList;

class Solution {


    public int evalRPN(String[] tokens) {
        Deque<Integer> numbers = new LinkedList<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (isNum(token)){
                numbers.push(Integer.parseInt(token));
            } else {
                Integer right= numbers.pop();
                Integer left = numbers.pop();

                Integer cal = cal(left, right, token);
                numbers.push(cal);
            }

        }

        return numbers.pop();

    }


    public boolean isNum(String target) {
        try {
            Integer.parseInt(target);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public Integer cal(Integer left , Integer right, String token){
        switch (token){
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/" :
                return left / right;
        }

        return 0;
    }

}