package com.zzxt.leetcode.q_22;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<String> result = new ArrayList<>();
    int n;
    int left;
    int right;

    public List<String> generateParenthesis(int n) {
        this.n = 2 * n;
        left = n;
        right = n;

        dfs(0, 0, 0, new StringBuilder(n * 2));

        return result;
    }


    public void dfs(int level, int leftUse, int rightUse, StringBuilder stringBuilder) {
        if (level == n) {
            String res = stringBuilder.toString();
            result.add(res);
            return;
        }


        if (leftUse < left) {
            stringBuilder.append("(");
            leftUse++;
            level++;
            dfs(level, leftUse, rightUse, stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            level--;
            leftUse--;
        }

        if (rightUse < right && rightUse < leftUse) {
            stringBuilder.append(")");
            rightUse++;
            level++;
            dfs(level, leftUse, rightUse, stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            level--;
            rightUse--;

        }


    }

    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(2));
    }
}