package com.zzxt.leetcode.q_141;

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
    public boolean hasCycle(ListNode head) {

        ListNode run1 = head;
        ListNode run2 = head;

        while (run1 != null && run2 != null){

            if (run1.next != null){
                run1 = run1.next;
            } else {
                return false;
            }

            if (run2.next != null && run2.next.next != null){
                run2 = run2.next.next;
            } else {
                return false;
            }

            if (run1 == run2){
                return true;
            }

        }
        return  false;
        
    }
}