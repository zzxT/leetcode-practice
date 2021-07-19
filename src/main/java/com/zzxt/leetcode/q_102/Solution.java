package com.zzxt.leetcode.q_102;

import com.zzxt.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    Deque<TreeNode> deque = new LinkedList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null){
            return result;
        }

        deque.add(root);
         while (!deque.isEmpty()){
             int size = deque.size();
             List<Integer> temp = new ArrayList<>(size);
             for (int i = 0; i < size; i++) {
                 TreeNode treeNode = deque.pollFirst();
                 temp.add(treeNode.val);

                 if (treeNode.left != null) {
                     deque.add(treeNode.left);
                 }

                 if (treeNode.right != null){
                     deque.add(treeNode.right);
                 }
             }

             result.add(temp);
         }

         return result;
    }


    public static void main(String[] args) {

        System.out.println(new Solution().levelOrder(new TreeNode(1)));
    }
}