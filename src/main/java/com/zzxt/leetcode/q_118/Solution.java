package com.zzxt.leetcode.q_118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        result.add(firstList);


        if (numRows == 1){
            return result;
        }

        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
//                int number = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                int first = 0;
                int second = 0;

                if (j >= 1){
                    first = result.get(i - 1).get(j -1);
                }

                if (j <= i - 1){
                    second = result.get(i -1 ).get(j);
                }

                temp.add(first + second);
            }

            result.add(temp);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().generate(5));
    }
}