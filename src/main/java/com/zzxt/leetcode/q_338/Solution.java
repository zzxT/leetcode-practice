package com.zzxt.leetcode.q_338;

import java.util.Arrays;

class Solution {
    public int[] countBits(int n) {

        int[] result = new int[n];
        for (int i = 0; i <= n; i++) {
             int times = 0;
             int x = i;
             while (x != 0){
                 x = x -  lowbit(x);
                 times++;
             }

             result[i] = times;
        }

        return result;

    }


    public int lowbit(int x){
        return x & -x;
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().lowbit(2));

        System.out.println(Arrays.toString(new Solution().countBits(2)));
    }
}