package com.zzxt.leetcode.q_23;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;
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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode node = null;
        ListNode head = null;

        int  nullSize = 0;
        while (true){
            nullSize = 0;
            int minIndex = 0;
            int min = Integer.MAX_VALUE;
            int lastMin = min;
            for (int i = 0; i < lists.length; i++) {
                ListNode data = lists[i];

                if (data == null){
                    nullSize++;
                    continue;
                }

                min = Math.min(data.val, min);
                if (lastMin != min){
                    minIndex = i;
                    lastMin = min;
                }
            }

            if (nullSize == lists.length){
                return head;
            }


            ListNode list = lists[minIndex];
            lists[minIndex] = list.next;
            if (node != null) {
                node.next = list;
            } else {
                head = list;
            }
            node = list;

        }


    }

    public static void main(String[] args) {
        ListNode[] data = new ListNode[3];
        ListNode one = new ListNode(1);
        ListNode one1 = new ListNode(2);
        one.next = one1;


        ListNode two = new ListNode(3);
        ListNode two2 = new ListNode(7);
        ListNode two3 = new ListNode(8);
        two.next = two2;
        two2.next = two3;

        ListNode three = new ListNode(4);
        ListNode three1 = new ListNode(5);
        three.next = three1;

        data[0] = one;
        data[1] = two;
        data[2] = three;
        new Solution().mergeKLists(data);
    }
}