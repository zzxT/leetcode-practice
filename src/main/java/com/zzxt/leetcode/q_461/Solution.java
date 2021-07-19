package com.zzxt.leetcode.q_461;

class Solution {
    public int hammingDistance(int x, int y) {

        int diff = x ^ y;
        int times = 0;
        while (diff != 0){
            diff = diff & (diff - 1);
            times++;
        }

        return times;

    }



}