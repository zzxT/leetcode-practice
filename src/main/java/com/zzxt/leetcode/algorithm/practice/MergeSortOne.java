package com.zzxt.leetcode.algorithm.practice;

import java.util.Arrays;

public class MergeSortOne {

    int[] temp;

    public void mergeSort(int[] data, int l, int r){

        if (temp == null){
            temp = new int[data.length];
        }

        if (l >= r){
            return;
        }

        int mid = l + r >> 1;

        mergeSort(data, l, mid);
        mergeSort(data, mid + 1, r);

        int i = l;
        int j = mid + 1;

        int k = 0;

        while (i <= mid && j <= r){
            if (data[i] <= data[j]){
                temp[k++] = data[i++];
            } else {
                temp[k++] = data[j++];
            }
        }

        while (i <= mid){
            temp[k++] = data[i++];
        }

        while (j <= r){
            temp[k++] = data[j++];
        }

        for (i = l, j = 0; i <= r; i++, j++){
            data[i] = temp[j];
        }
    }

    public static void main(String[] args) {
        int[] data = {2, 1, 5, 3, 7};
        new MergeSortOne().mergeSort(data, 0, 4);
        System.out.println(Arrays.toString(data));
    }
}
