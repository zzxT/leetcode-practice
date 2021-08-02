package com.zzxt.leetcode;

import com.zzxt.leetcode.algorithm.practice.MergeSort3;

import java.util.Arrays;

public class MergeSort5 {

    int[] tmp = new int[10000];

    public void sort(int[] data, int l, int r){
        if (l >= r){
            return;
        }

        int mid = l + r >> 1;

        sort(data, l, mid);
        sort(data, mid + 1, r);


        int i = l;
        int j = mid + 1;

        int k = 0;

        while (i <= mid && j <= r){
            if (data[i] <= data[j]){
                tmp[k++] = data[i++];
            } else {
                tmp[k++] = data[j++];
            }
        }


        while (i <= mid){
            tmp[k++] = data[i++];
        }

        while (j <= r){
            tmp[k++] = data[j++];
        }


        for (i = l, j = 0 ; i < r; i++, j++){
            data[i] = tmp[j];
        }
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 1, 6, 9, 8};
        new MergeSort5().sort(data, 0, 5);
        System.out.println(Arrays.toString(data));
    }
}
