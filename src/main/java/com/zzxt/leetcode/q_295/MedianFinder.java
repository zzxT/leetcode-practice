package com.zzxt.leetcode.q_295;

import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinder {

    /**
     * initialize your data structure here.
     */
    PriorityQueue<Integer> bigHeap;

    PriorityQueue<Integer> smallHeap;

    public MedianFinder() {
        bigHeap = new PriorityQueue<>(Comparator.reverseOrder());
        smallHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (bigHeap.isEmpty() || bigHeap.peek() > num) {
            bigHeap.offer(num);
        } else {
            smallHeap.offer(num);
        }

        int bigSize = bigHeap.size();
        int smallSize = smallHeap.size();


        if (bigSize - smallSize > 1) {
            smallHeap.offer(bigHeap.poll());
        } else if (smallSize - bigSize > 1){
            bigHeap.offer(smallHeap.poll());
        }
    }

    public double findMedian() {
        int bigSize = bigHeap.size();
        int smallSize = smallHeap.size();

        return bigSize == smallSize
                ? (bigHeap.peek() + smallHeap.peek()) * 1.0 / 2
                : (bigSize > smallSize ? bigHeap.peek() : smallHeap.peek());
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        medianFinder.addNum(3);

        System.out.println(medianFinder.findMedian());
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */