package com.zzxt.leetcode.q_125;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();
        StringBuilder target = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)){
                target.append(Character.toLowerCase(c));
            }
        }


        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != target.charAt(target.length() - 1 - i )){
                return false;
            }
        }
        return true;
    }

}