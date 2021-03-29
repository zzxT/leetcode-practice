package com.zzxt.leetcode.q_203;

import com.zzxt.leetcode.bean.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null){
            return null;
        }

        ListNode result = head;
        ListNode perv = null;

        while (head != null) {
            if (head.val == val) {
                if (perv != null) {
                    perv.next = head.next;
                } else  {
                    result = head.next;
                }
            } else {
                perv = head;
            }

            head = head.next;

        }

        return result;
    }
}