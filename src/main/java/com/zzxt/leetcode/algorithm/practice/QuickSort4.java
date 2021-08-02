package com.zzxt.leetcode.algorithm.practice;

import com.zzxt.leetcode.q_191.Solution;

import java.util.Arrays;

public class QuickSort4 {



    public void sort(int[] data, int l, int r){

        if (l >= r){
            return;
        }

        int i = l - 1;
        int j = r + 1;
        int x = data[l + r >> 1];

        while (i < j ){
            while (data[++i] < x);

            while (data[--j] > x);

            if (i <j ){
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        sort(data, l, j);
        sort(data, j + 1, r);
    }

    public static void main(String[] args) {
        int[] data = {3, 1, 2, 9, 7};
        new QuickSort4().sort(data, 0 , 4);
        System.out.println(Arrays.toString(data));
    }

}
