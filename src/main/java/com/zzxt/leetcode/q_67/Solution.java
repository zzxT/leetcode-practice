package com.zzxt.leetcode.q_67;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;
import javafx.beans.binding.StringBinding;

import java.sql.ResultSet;

class Solution {

    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;


        boolean isOne = false;
        StringBuilder stringBuilder = new StringBuilder(a.length());
        while (i >= 0 && j >=0){

            int first = Character.digit(a.charAt(i), 10);
            int second =Character.digit( b.charAt(j), 10);
            i--;
            j--;

            int result = first + second;

            result = isOne ? result + 1 : result;

            if (result > 1){
                isOne = true;
                result = result - 2;
            } else {
                isOne = false;
            }

            stringBuilder.insert(0, result);
        }


        while (i >= 0){
            int result = Character.digit(a.charAt(i), 10);
            if (isOne){
                result++;
                if (result > 1){
                    result = result - 2;
                    isOne = true;
                } else {
                    isOne = false;
                }

            }
            i--;
            stringBuilder.insert(0, result);
        }


        while (j >= 0){
            int result = Character.digit(b.charAt(j), 10);
            if (isOne){
                result++;
                if (result > 1){
                    result = result - 2;
                    isOne = true;
                } else {
                    isOne = false;
                }

            }
            j--;
            stringBuilder.insert(0, result);
        }

        if (isOne){
            stringBuilder.insert(0, 1);
        }

        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("101111", "10"));
//        111
//        111
//       1110
    }
}