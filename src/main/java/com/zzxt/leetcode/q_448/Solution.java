package com.zzxt.leetcode.q_448;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] result = new int[nums.length + 1];

        for (int i = 0; i <= nums.length; i++) {
            result[nums[i]]++;
        }
        List<Integer> returnData = new ArrayList<>();
        for (int i = 1; i < result.length; i++) {
            if (result[i] == 0){
                returnData.add(i);
            }
        }

        return returnData;
    }
}