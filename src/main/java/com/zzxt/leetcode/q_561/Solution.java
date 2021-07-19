package com.zzxt.leetcode.q_561;

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0){
                sum += nums[i];
            }
        }

        return  sum;
    }

    public void quickSort(int[] nums, int l, int r){
        if (l >= r){
            return;
        }

        int i = l - 1;
        int j = r + 1;
        int x = nums[l + r >> 1];

        while (i < j){
            while (nums[++i] > x);

            while (nums[--j] < x);

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
        System.out.println(new Solution().arrayPairSum(new int[]{6,2,6,5,1,2}));
    }
}