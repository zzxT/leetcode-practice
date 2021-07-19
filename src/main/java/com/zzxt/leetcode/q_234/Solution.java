package com.zzxt.leetcode.q_234;

import com.zzxt.leetcode.bean.ListNode;

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
    public boolean isPalindrome(ListNode head) {

        int sum = 0;
        // x ~& x = 0
        // 10011 ~& 01100  = 11111
        //
        int size =0;
        while (head != null){
            sum = sum ^ head.val;
            head = head.next;
            size++;
        }

        return size == 1 || sum == 0;
    }


    public boolean isPalindrome1(ListNode head) {
        List<Integer> listNodes = new ArrayList<>();

        while (head != null){
            listNodes.add(head.val);
            head = head.next;
        }


        int left = 0;
        int right = listNodes.size() - 1;

        while (left <= right){
            if (!listNodes.get(left).equals(listNodes.get(right))){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

//        [1,3,0,2]
        ListNode one = new ListNode(1);
        ListNode three = new ListNode(3);
        ListNode one1 = new ListNode(1);

        one.next = three;
        three.next = one1;


        new Solution().isPalindrome1(one);
    }
}