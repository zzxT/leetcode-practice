package com.zzxt.leetcode.algorithm.practice;

import com.zzxt.leetcode.q_141.Solution;

import java.util.ArrayList;
import java.util.List;

public class PrintN {


    List<String> result = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();

    public List<String> print(int n) {

        boolean[] numbers = new boolean[n + 1];

        dfs(n, 0, numbers);

        return result;
    }


    public void dfs(int n, int level, boolean[] numbers) {
        if (level == n){
            result.add(stringBuilder.toString());
            return;
        }


        for (int i = 1; i <= n; i++) {
            if (!numbers[i]){
                stringBuilder.append(i);
                level++;
                numbers[i] = true;
                dfs(n, level, numbers);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                numbers[i] = false;
                level--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new PrintN().print(3));
    }

}
