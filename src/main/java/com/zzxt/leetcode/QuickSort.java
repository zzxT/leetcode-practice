package com.zzxt.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {


    public void sort(int[] nums , int l, int r){
        if (l >= r){
            return;
        }

        int i = l - 1;
        int j = r + 1;
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


        sort(nums, l, j);
        sort(nums, j + 1, r);
    }


    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 4, 5};
        new QuickSort().sort(nums, 0, 4);
        System.out.println(Arrays.toString(nums));
    }
}
