package com.zzxt.leetcode.q_17;

import javax.swing.text.html.parser.TagElement;
import java.util.ArrayList;
import java.util.List;

class Solution {


    List<List<String>> tables = new ArrayList<>();

    {
        List<String> one = new ArrayList<>();
        one.add("a");
        one.add("b");
        one.add("c");

        List<String> two = new ArrayList<>();
        two.add("d");
        two.add("e");
        two.add("f");

        List<String> three = new ArrayList<>();
        three.add("g");
        three.add("h");
        three.add("i");

        List<String> fout = new ArrayList<>();
        fout.add("j");
        fout.add("k");
        fout.add("l");

        List<String> five = new ArrayList<>();
        five.add("m");
        five.add("n");
        five.add("o");

        List<String> six = new ArrayList<>();
        six.add("p");
        six.add("q");
        six.add("r");
        six.add("s");

        List<String> seven = new ArrayList<>();
        seven.add("t");
        seven.add("u");
        seven.add("v");

        List<String> eight = new ArrayList<>();
        eight.add("w");
        eight.add("x");
        eight.add("y");
        eight.add("z");

        tables.add(one);
        tables.add(two);
        tables.add(three);
        tables.add(fout);
        tables.add(five);
        tables.add(six);
        tables.add(seven);
        tables.add(eight);
    }



    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        char[] digitChars = digits.toCharArray();


        int index = Integer.parseInt(digitChars[0] + "") - 2;
        List<String> result = new ArrayList<>(tables.get(index));


        for (int i = 1; i < digitChars.length; i++) {
            result = combine(result,digitChars[i]);
        }

        return result;
    }


    public List<String> combine(List<String> result, char target) {

        List<String> newResult = new ArrayList<>();
        int index = Integer.parseInt(target + "") - 2;
        for (int i = 0; i < tables.get(index).size(); i++) {
            for (int j = 0; j < result.size(); j++) {
                newResult.add(result.get(j) + (tables.get(index).get(i)));
            }
        }

        return newResult;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().letterCombinations("7"));
    }
}