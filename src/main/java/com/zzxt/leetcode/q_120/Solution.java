package com.zzxt.leetcode.q_120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int[][] result = new int[201][201];
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                result[i][j] = Integer.MAX_VALUE;
            }
        }

        result[0][0] = triangle.get(0).get(0);
        for ( int i = 1; i < triangle.size(); i++) {
            List<Integer> columns = triangle.get(i);
            for (int j = 0; j < columns.size(); j++) {

                int f1;
                if (j == 0) {
                    f1 = Integer.MAX_VALUE;
                } else {
                    f1 = result[i - 1][j - 1];
                }

                result[i][j] = Integer.min(f1, result[i -1 ][j]) + triangle.get(i).get(j);

            }
        }

        int resu = Integer.MAX_VALUE;
        for (int k = 0; k < triangle.get(triangle.size() - 1).size(); k++) {
            resu = Integer.min(result[triangle.size() - 1][k], resu);
        }

        return resu;

    }


    public static void main(String[] args) {
        List<List<Integer>> root = new ArrayList<>();
        List<Integer> objects = new ArrayList<>();
        objects.add(2);
        root.add(objects);

        List<Integer> ob2 = new ArrayList<>();
        ob2.add(3);
        ob2.add(4);
        root.add(ob2);

        List<Integer> ob3 = new ArrayList<>();
        ob3.add(6);
        ob3.add(5);
        ob3.add(7);
        root.add(ob3);

        List<Integer> ob4 = new ArrayList<>();
        ob4.add(4);
        ob4.add(1);
        ob4.add(8);
        ob4.add(3);
        root.add(ob4);

        new Solution().minimumTotal(root);
    }
}