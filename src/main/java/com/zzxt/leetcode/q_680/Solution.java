package com.zzxt.leetcode.q_680;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        List<Pair<Integer, Integer>> errors = new ArrayList<>();
        while (left <= right){
            if (s.charAt(left) != s.charAt(right)){
                errors.add(new Pair<>(left, right));
            } else {
                left++;
                right++;
            }
        }

        if (errors.size() == 0){
            return true;
        }

        if (errors.size() == 1){
            Pair<Integer, Integer> error = errors.get(0);
        }

        if (errors.size() > 1){
            return false;
        }

        return false;
    }
}