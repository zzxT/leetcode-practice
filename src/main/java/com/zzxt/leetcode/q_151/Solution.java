package com.zzxt.leetcode.q_151;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String reverseWords(String s) {
        s= s.trim();
        String[] words = s.split("\\s+");
        List<String> wordsList = Arrays.asList(words);
        Collections.reverse(wordsList);
        return String.join(" ",wordsList);

    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("a good   example"));
    }
}