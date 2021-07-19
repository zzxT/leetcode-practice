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

    public static void main(String[] args) {
        int[] data = {2, 1, 5, 4, 7};
        new QuickSort().quickSort(data, 0, 4);
        System.out.println(
                Arrays.toString(data));
    }
}
