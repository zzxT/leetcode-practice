package com.zzxt.leetcode.q_79;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public boolean exist(char[][] board, String word) {
        List<Pair<Integer, Integer>> first = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    first.add(new Pair<>(i, j));
                }
            }
        }


        for (int i = 0; i < first.size(); i++) {
            int x = first.get(i).getKey();
            int y = first.get(i).getValue();
            Set<String> path = new HashSet<>();
            path.add(x + "|" + y);
            for (int j = 1; j < word.length(); j++) {
                if (!path.contains("" + (x + 1) + "|" + y) && (x + 1) < board.length && board[x + 1][y] == word.charAt(j)) {
                    x = x + 1;
                    path.add(x + "|" + y);
                } else if (!path.contains("" + (x) + "|" + (y + 1)) && (y + 1) < board[0].length && board[x][y + 1] == word.charAt(j)) {
                    y = y + 1;
                    path.add(x + "|" + y);
                } else if (!path.contains("" + (x - 1) + "|" + y) && (x - 1) >= 0 && board[x - 1][y] == word.charAt(j)) {
                    x = x - 1;
                    path.add(x + "|" + y);
                } else if (!path.contains("" + (x) + "|" + (y - 1)) && (y - 1) >= 0 && board[x][y - 1] == word.charAt(j)) {
                    y = y - 1;
                    path.add(x + "|" + y);
                } else {
                    break;
                }
            }
            if (path.size() == word.length()) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCD"));
//        System.out.println(new Solution().exist(new char[][]{{'a', 'b'}}, "ba"));
        System.out.println(new Solution().exist(new char[][]{{'C','A','A'},{'A','A','A'},{'B','C','D'}} ,"AAB"));
    }
}