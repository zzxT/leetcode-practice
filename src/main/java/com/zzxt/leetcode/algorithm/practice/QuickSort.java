package com.zzxt.leetcode.algorithm.practice;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] data, int l, int r){
        if (l >= r){
            return;
        }

        int i = l - 1;
        int j = r + 1;
        int x = data[l + r >> 1];

        while (i < j){
            while (data[++i] < x);

            while (data[--j] > x);

            if (i < j){
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        quickSort(data, l, j);
        quickSort(data, j + 1, r);
    }

    public int binarySearch(int[] data, int target){

        int l = 0 ;
        int r = data.length - 1;

        while (l <= r){
            int mid = l + (r - l) / 2;

            if (data[mid] > target){
                r = mid - 1;
            } else if (data[mid] == target){
                return mid;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    public static  volatile boolean isClose  = false;
    public static void main(String[] args) throws InterruptedException {
        int[] data = {2, 1, 5, 4, 7};
        new QuickSort().quickSort(data, 0, 4);
        System.out.println(
                Arrays.toString(data));
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!isClose){
                    System.out.println(new QuickSort().binarySearch(data, 7));
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
//        isClose = true;
//        thread.join();

    }
}
