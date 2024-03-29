package com.zzxt.leetcode.q_62;

class Solution {
    public int uniquePaths(int m, int n) {

        int[][] fn = new int[m][n];

        for (int i = 0; i < m; i++) {
            fn[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            fn[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                fn[i][j] = fn[i][j - 1] + fn[i -1 ][j];
            }
        }

        return fn[m- 1][n -1];
    }
}