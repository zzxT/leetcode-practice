package com.zzxt.leetcode.q_142;

import com.zzxt.leetcode.bean.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

//        int first = 0;
//        int second = 0;

        if (head ==null){
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        ListNode headCopy = head;
        while (true){

            if (first.next == null){
                return null;
            }

            if (second.next == null || second.next.next == null){
                return null;
            }

            first = first.next;

            second = second.next.next;

            if (first == second){

                while (headCopy != first){
                    headCopy = headCopy.next;
                    first = first.next;
                }

                return headCopy;
            }
        }
        
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        one.next = two;
        two.next = one;
        new Solution().detectCycle(one);
    }
}