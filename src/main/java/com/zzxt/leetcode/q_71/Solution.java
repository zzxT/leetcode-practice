package com.zzxt.leetcode.q_71;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

class Solution {
    public String simplifyPath(String path) {


        String[] paths = path.split("/");

        Deque<String> stack = new LinkedList<>();

        if (paths.length == 0){
            return "/";
        }

        for (int i = 0; i < paths.length; i++) {
            String current = paths[i];

            if (current.equals(".") || (!stack.isEmpty() && current.equals(""))){
                continue;
            } else if (current.equals("..")){
                if (!stack.isEmpty() && !stack.peek().equals("")){
                    stack.pop();
                }
            } else {
                stack.push(current);
            }
        }
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()){
            if (stack.size() != 1){
                result.append(stack.pollLast()).append("/");
            } else {
                String poll = stack.poll();
                if (poll.equals("")) {
                    result.append("/");
                } else {
                    result.append(poll);
                }
            }

        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().simplifyPath("///"));
    }
}