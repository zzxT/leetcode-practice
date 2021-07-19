package com.zzxt.leetcode.q_111;

import com.zzxt.leetcode.bean.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
// TODO: 2021/6/7
class Solution {

    Deque<TreeNode> deque = new LinkedList<>();


    public int minDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }

        deque.add(root);

        while (!deque.isEmpty()) {
            depth++;
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = deque.poll();

                if (poll.left == null && poll.right == null) {
                    return depth;
                }
                if (poll.left != null) {
                    deque.add(poll.left);
                }
                if (poll.right != null) {
                    deque.add(poll.right);
                }

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        TreeNode left = new TreeNode(9);
        root.left = left;

        TreeNode right = new TreeNode(20);
        root.right = right;

        TreeNode rightleft = new TreeNode(15);
        right.left = rightleft;

        TreeNode rightright = new TreeNode(7);
        right.right = rightright;

        System.out.println(new Solution().minDepth(root));
    }

}
