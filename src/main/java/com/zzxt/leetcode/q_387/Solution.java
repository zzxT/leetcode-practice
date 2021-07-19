package com.zzxt.leetcode.q_387;

import javafx.util.Pair;

import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Pair<Integer, Integer>> times = new LinkedHashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (times.containsKey(s.charAt(i))){
                Pair<Integer, Integer> pair = times.get(s.charAt(i));
                times.put(s.charAt(i), new Pair<>(pair.getKey() + 1, pair.getValue()));
            } else {
                times.put(s.charAt(i), new Pair<>(1, i));
            }
        }


        Iterator<Map.Entry<Character, Pair<Integer, Integer>>> iterator = times.entrySet().iterator();


        while (iterator.hasNext()){
            Map.Entry<Character, Pair<Integer, Integer>> entry = iterator.next();

            if (entry.getValue().getKey() == 1){
                return entry.getValue().getValue();
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("loveleetcode"));
    }
}