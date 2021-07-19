package com.zzxt.leetcode.q_1539;

import java.lang.reflect.Array;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        boolean[] data = new boolean[10001];

        for (int i = 0; i < arr.length; i++) {
            data[arr[i]] = true;
        }

        int times = 0;
        for (int i = 1; i < data.length; i++) {
            if (!data[i]){
                times++;
            }

            if (times == k){
                return i;
            }
        }

        return -1;
    }
}