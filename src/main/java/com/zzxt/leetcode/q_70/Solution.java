package com.zzxt.leetcode.q_70;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// TODO: 2021/6/8 wrong 这道题目要用动态规划，或者数学方法。正常的递归或者循环会导致超时或者内存溢出
class Solution {
// f(x) = f(x - 1) + f(x - 2)
    public int climbStairs(int n) {

        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
                result[i] = result[i - 1] + result[i - 2];
        }

        return result[n];

    }


}