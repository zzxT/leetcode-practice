package com.zzxt.leetcode.q_453;

import java.util.Arrays;

class Solution {
    
    public int minMoves(int[] nums) {
        // 3 2 1 = 6 
        // 1 2 3 4 
        // 2 3 4 4
        // 3 4 5 4
        // 4 5 6 4 
        // 5 6 6 5 
        // 6 7 6 6 
        // 7 7 7 7
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i] - min;
        }

        return  result;
    }
}