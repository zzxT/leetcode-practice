package com.zzxt.leetcode.q_384;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {

    int[] origin;
    List<Integer> data;

    public Solution(int[] nums) {
        origin = nums;
        data = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            data.add(nums[i]);
        }
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return origin;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {

        Collections.shuffle(data);
        int[] result = new int[data.size()];
        for (int i = 0; i < data.size(); i++) {
            result[i] = data.get(i);
        }

        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */