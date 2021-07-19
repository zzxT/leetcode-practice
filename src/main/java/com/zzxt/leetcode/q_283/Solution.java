package com.zzxt.leetcode.q_283;

import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            while (left <= right && nums[left] != 0) {
                left++;
            }

            if (left <= right) {
                for (int i = left; i < right; i++) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }

                right--;
            }
        }
    }


    public void moveZeros(int[] nums){
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }


        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new Solution().moveZeroes(nums);

        System.out.println(Arrays.toString(nums));


        new Solution().moveZeros(nums);
    }
}