package com.zzxt.leetcode.q_165;

class Solution {
    public int compareVersion(String version1, String version2) {
        String[] versionOne = version1.split("\\.");
        String[] versionTwo = version2.split("\\.");

        int result = 0;
        int i = 0;
        for (; i < versionOne.length; i++) {

            if (i >= versionTwo.length){
                for (int j = i; j < versionOne.length; j++) {
                    if (Integer.parseInt(versionOne[j]) > 0) {
                        return 1;
                    }
                }

                return 0;
            }

            int one = Integer.parseInt(versionOne[i]);
            int two = Integer.parseInt(versionTwo[i]);

            if (one < two){
                return -1;
            } else if (one > two){
                return 1;
            }


        }

        if (i < versionTwo.length){
            for (int j = i; j < versionTwo.length; j++) {
                if (Integer.parseInt(versionTwo[j]) > 0 ){
                    return  -1;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().compareVersion("1.0.1.0", "1"));
    }
}