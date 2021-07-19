package com.zzxt.leetcode.q_409;

import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        List<Character> pairs = new ArrayList<>();
        Set<Character> path = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (path.contains(current)){
                pairs.add(current);
                path.remove(current);
            } else {
                path.add(current);
            }
        }

        int result = 0;
        if (path.size() > 0){
            result++;
        }

        return result + pairs.size() * 2;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("abccccdd"));
    }
}