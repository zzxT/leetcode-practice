package com.zzxt.leetcode.q_31;

import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int left = nums.length - 2;
        int right = nums.length - 1;

        while (left >= 0) {
            if (nums[right] > nums[left]) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                return;
            }

            left--;
            right--;
        }

        Arrays.sort(nums);
    }
}