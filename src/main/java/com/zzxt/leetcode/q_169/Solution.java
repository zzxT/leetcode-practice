package com.zzxt.leetcode.q_169;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> times = new HashMap<>(nums.length);

        int limit = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            Integer time = times.getOrDefault(num, 0);
            time++;
            if (time > limit){
                return num;
            }
            times.put(num, time);
        }

        return 0;
    }
}