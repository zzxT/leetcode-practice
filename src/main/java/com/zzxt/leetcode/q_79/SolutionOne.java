package com.zzxt.leetcode.q_79;

class SolutionOne {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean result = check(board, visited, i, j, word, 0);
                if (result){
                    return true;
                }
            }
        }

        return false;
    }

    int[][] dir = new int[][]{{0, 1}, {1,0}, {-1,0}, {0, -1}};

    public boolean check(char[][] board, boolean[][] visited, int i, int j, String s, int k) {
        if (board[i][j] != s.charAt(k)){
            return false;
        } else if (k == s.length()  - 1){
            return true;
        }
        visited[i][j] = true;
        boolean result = false;
        for (int[] d : dir) {
            int ni = i + d[0];
            int nj = j + d[1];

            if (ni >=0 && ni < board.length && nj >= 0 && nj < board[0].length){
                if (!visited[ni][nj]){
                    boolean check = check(board, visited, ni, nj, s, k + 1);
                    if (check){
                        result = true;
                        break;
                    }
                }
            }
        }

        visited[i][j] = false;
        return result;
    }


    public static void main(String[] args) {
//        System.out.println(new Solution().exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCD"));
//        System.out.println(new Solution().exist(new char[][]{{'a', 'b'}}, "ba"));
        System.out.println(new SolutionOne().exist(new char[][]{{'C','A','A'},{'A','A','A'},{'B','C','D'}} ,"AAB"));
    }
}