package com.zzxt.leetcode.q_5;

class Solution {
    public String longestPalindrome(String s) {

        boolean[][] fn = new boolean[s.length()][s.length()];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (i == j){
                    fn[i][j] = true;

                } else {

                }


            }
        }

        return null;
    }
}
