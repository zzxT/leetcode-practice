package com.zzxt.leetcode.q_392;

class Solution {
    public boolean isSubsequence(String s, String t) {



        if ("".equals(s) || "".equals(t) ){
            return true;
        }

        if (s.equals(t)){
            return true;
        }


        int si = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(si) == t.charAt(i)){
                si++;

                if (si == s.length()){
                    return true;
                }
            }
        }

        return si == s.length();
    }


}