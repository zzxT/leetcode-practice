package com.zzxt.leetcode.q_412;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n + 1);
        for (int i = 1; i <= n; i++) {
            if ( (i % 3 == 0 )&&  ( i % 5 == 0)){
                result.add("FizzBuzz");
            } else if (i % 5 == 0){
                result.add("Buzz");
            } else if ( i % 3 == 0){
                result.add("Fizz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().fizzBuzz(5));
        System.out.println(1 / 3);
    }
}