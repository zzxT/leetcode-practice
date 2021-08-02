package com.zzxt.leetcode.algorithm.practice;

import java.util.Arrays;

public class MergeSort3 {

    int[] temp = new int[100000];
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

    public int binarySearch(int[] data, int target){
        int l = 0;
        int r = data.length - 1;

        while (l <= r){
            int mid = l + (r - l ) /2;

            if (data[mid] == target) {
                return mid;
            } else if (data[mid] > target){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] data = {3, 1, 2, 5, 4};
        new MergeSort3().sort(data, 0 , 4);

        System.out.println(Arrays.toString(data));
        System.out.println(new MergeSort3().binarySearch(data, 5));


    }

}
