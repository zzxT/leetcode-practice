package com.zzxt.leetcode.q_64;

class Solution {

    public int minPathSum(int[][] grid) {

        int[][] fn = new int[grid.length][grid[0].length];

        fn[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            fn[i][0] = fn[i - 1][0] + grid[i][0];
//            fn[i][grid[0].length - 1] = fn[i][grid[0].length - 1] +  grid[i][grid[0].length - 1];
        }

        for (int i = 1; i < grid[0].length; i++) {
            fn[0][i] = fn[0][i - 1] + grid[0][i];
//            fn[grid.length - 1][i] = fn[grid.length - 1][i - 1] +  grid[grid.length - 1][i];
        }


        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                    fn[i][j] = Math.min(fn[i - 1][j], fn[i][j - 1]) + grid[i][j];
            }
        }

//        return fn[grid.length -  1][grid[0].length - 1] = Math.min(fn[grid.length  - 2 ][grid[0].length - 1],
//                fn[grid.length - 1][grid[0].length - 2]) + grid[grid.length - 1][grid[0].length - 1];
        return fn[grid.length - 1][grid[0].length - 1];

    }
}

