package com.zzxt.leetcode.q_316;

import java.util.Arrays;

class Solution {
    public String removeDuplicateLetters(String s) {
        char[] target = s.toCharArray();
        Arrays.sort(target);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < target.length; i++) {
            if (i == 0 || target[i - 1] != target[i]) {
                stringBuilder.append(target[i]);
            }
        }

        return stringBuilder.toString();
    }
}