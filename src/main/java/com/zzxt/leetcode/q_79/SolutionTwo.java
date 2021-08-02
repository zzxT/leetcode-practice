package com.zzxt.leetcode.q_79;

class SolutionTwo {
    public boolean exist(char[][] board, String word) {

        boolean result = false;
        boolean[][] state = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                result = check(board, word, i, j, 0, state);
                if (result){
                    return result;
                }

            }
        }

        return result;
    }

    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public boolean check(char[][] board, String word, int i, int j, int k , boolean[][] state){
        if (board[i][j] != word.charAt(k)){
            return false;
        } else if (k == word.length() - 1){
            return true;
        }

        state[i][j] = true;

        for (int[] dir : dirs) {
            int ni = i + dir[0];
            int nj = j + dir[1];

            if (ni < board.length && ni >= 0 && nj < board[0].length && nj >= 0 ){
                if (!state[ni][nj]){
                    boolean check = check(board, word, ni, nj, k + 1, state);
                    if (check){
                        return true;
                    }
                }
            }
        }

        state[i][j] = false;
        return false;
    }


    public static void main(String[] args) {
        System.out.println(new SolutionTwo().exist(new char[][]{{'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}}, "DAD"));
    }
}