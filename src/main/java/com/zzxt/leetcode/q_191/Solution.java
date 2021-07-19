package com.zzxt.leetcode.q_191;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        int times = 0;

        while (n != 0){
            n -= n & (-n);
            times++;
        }

        return times;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(-3));
    }

}