package com.zzxt.leetcode.q_326;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public boolean isPowerOfThree(int n) {
        Collections.shuffle(Arrays.asList(new int[]{1,2,3}));
        while (true){

            if (n % 3 == 0){
                n = n / 3;

                if (n == 0){
                    return true;
                }
            } else {
                return false;
            }
        }


    }
}