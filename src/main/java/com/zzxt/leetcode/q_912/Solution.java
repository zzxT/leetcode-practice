package com.zzxt.leetcode.q_912;

import java.util.Arrays;

class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);

        return nums;
    }



    public void quickSort(int[] nums, int l, int r){
        if (l >= r){
            return;
        }

        int i = l - 1; int j = r + 1;
        int x = nums[l + r >> 1];

        while (i < j){
            while (nums[++i] < x);

            while (nums[--j] > x);

            if (i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

        }

        quickSort(nums, l, j);
        quickSort(nums, j + 1, r);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().sortArray(new int[]{2,3,1})));
    }
}