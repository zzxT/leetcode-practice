package com.zzxt.leetcode.algorithm.practice;

import java.util.Arrays;

public class MergeSort {


    int[] temp = new int[100];
    int[] tmp = new int[100];

    void merge_sort(int q[], int l, int r) {
        if (l >= r) return;

        int mid = l + r >> 1;
        merge_sort(q, l, mid);
        merge_sort(q, mid + 1, r);

        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= r)
            if (q[i] <= q[j]) tmp[k++] = q[i++];
            else tmp[k++] = q[j++];

        while (i <= mid) tmp[k++] = q[i++];
        while (j <= r) tmp[k++] = q[j++];

        for (i = l, j = 0; i <= r; i++, j++) q[i] = tmp[j];


    }


    public void sort(int[] data, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = l + r >> 1;

        sort(data, l, mid);
        sort(data, mid + 1, r);

        int i = l;
        int j = mid + 1;

        int k = 0;
        while (i <= mid && j <= r) {
            if (data[i] >= data[j]) {
                temp[k++] = data[j++];
            } else {
                temp[k++] = data[i++];
            }
        }

        while (i <= mid) {
            temp[k++] = data[i++];
        }

        while (j <= r) {
            temp[k++] = data[j++];
        }

        for (i = l, j = 0; i <= r; i++, j++) {
            data[i] = temp[j];
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 2, 5};
        new MergeSort().sort(data, 0, 3);
        System.out.println(Arrays.toString(data));
//        new MergeSort().merge_sort(data, 0, 3);
//        System.out.println(Arrays.toString(data));

    }
}
