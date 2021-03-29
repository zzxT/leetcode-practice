package com.zzxt.leetcode.q_21;

import java.util.ArrayList;
import java.util.List;

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null){
            return null;
        }

        if (l1 == null){
            return l2;
        }

        if (l2 == null){
            return l1;
        }

        ListNode currentResult = new ListNode();
        ListNode first = currentResult;
        ListNode prev = null;

        while (l1  != null  && l2 != null){

            int current1 = l1.val;
            int current2 = l2.val;

            if (current1 <= current2){
                currentResult.val = current1;
                l1 = l1.next;

            } else {
                currentResult.val = current2;
                l2 = l2.next;
            }


            prev = currentResult;
            currentResult = new ListNode();
            prev.next = currentResult;


        }

        if (l1  == null && prev != null){
            prev.next = l2;
        }

        if (l2  == null && prev != null){
            prev.next = l1;
        }


        return first;
    }


    public static void main(String[] args) {

        List<Integer> data = new ArrayList<Integer>();
        data.add(1);
        data.add(3);
        data.add(5);

        ListNode listNode = init(data);
//        sout(listNode);


        List<Integer> data1 = new ArrayList<Integer>();
        data1.add(1);
        data1.add(2);
        data1.add(4);

        ListNode listNode1 = init(data1);
        ListNode listNode2 = new Solution().mergeTwoLists(listNode, listNode1);

        sout(listNode2);

    }

    public static void sout(ListNode listNode){
        while (listNode  != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode init(List<Integer> data){
        ListNode listNode1 = new ListNode();
        ListNode result = listNode1;
        listNode1.val = data.get(0);



        for (int i = 1; i < data.size(); i++) {
            ListNode listNode = new ListNode();
            listNode.val = data.get(i);
            listNode1.next = listNode;
            listNode1 = listNode;
        }

        return result;

    }



}