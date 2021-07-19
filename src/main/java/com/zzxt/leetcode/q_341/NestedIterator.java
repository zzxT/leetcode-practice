package com.zzxt.leetcode.q_341;

import com.zzxt.leetcode.bean.NestedInteger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NestedIterator implements Iterator<Integer> {



    List<Integer> result = new ArrayList<>();
    Iterator<Integer> iterator;

    public NestedIterator(List<NestedInteger> nestedList) {
        plat(nestedList);
        this.iterator = result.iterator();
    }
    private void plat(List<NestedInteger> nestedIntegers) {

        for (int i = 0; i < nestedIntegers.size(); i++) {
            NestedInteger nestedInteger = nestedIntegers.get(i);

            if (nestedInteger.isInteger()) {
                result.add(nestedInteger.getInteger());
            } else {
                plat(nestedInteger.getList());
            }
        }
    }


    @Override
    public Integer next() {
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
}