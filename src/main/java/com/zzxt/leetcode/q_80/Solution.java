package com.zzxt.leetcode.q_80;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int removeDuplicates(int[] nums) {

        Map<Integer, Integer> index = new HashMap<>();
        int right = nums.length - 1;
        for (int i = 0; i < right + 1; i++) {
            int times = index.getOrDefault(nums[i], 0) + 1;

            while (times == 3){
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;
                right--;
                times = index.getOrDefault(nums[i], 0)  + 1;
            }

            index.put(nums[i], times);
        }

        return right + 1;
    }


    public int removeDuplicatesF(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }




    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicatesF(new int[]{1, 1, 1, 2, 2, 3}));
    }
}