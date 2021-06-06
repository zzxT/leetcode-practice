package com.zzxt.leetcode.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort {

    // 1. fetch one
    // 2  sort left sort right
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer>  array =  new ArrayList<>();

        while (scanner.hasNext()) {
               array.add(scanner.nextInt());
        }

//        List<Integer> array = new ArrayList<>();
//        array.add(1);
//        array.add(0);
//        array.add(4);
//        array.add(2);
//        array.add(3);


        quickSort(array, 0, array.size() - 1);
        System.out.println(array);
    }


    public static void quickSort(List<Integer> target, int left , int right) {

        if ( left >= right) {
            return;
        }

        Integer sentinel = target.get(left);

        int lp = left - 1;
        int rp = right + 1;

        while (lp < rp) {


            do {
                lp++;
            } while (target.get(lp) < sentinel);


            do {
                rp--;
            } while (target.get(rp) > sentinel);

            if (lp < rp) {
                Integer bigger = target.get(lp);
                Integer smaller = target.get(rp);
                target.set(lp, smaller);
                target.set(rp, bigger);
            }
        }

        quickSort(target, left, rp);
        quickSort(target, rp + 1, right);
    }
}
