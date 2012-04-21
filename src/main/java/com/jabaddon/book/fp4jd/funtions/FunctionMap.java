package com.jabaddon.book.fp4jd.funtions;

import java.util.ArrayList;
import java.util.List;

public class FunctionMap<T> {
    List<T> apply(List<T> original, Function1<T, T> function) {
        List<T> newList = new ArrayList<T>();
        for (T item: original) {
            newList.add(function.apply(item));
        }
        return newList;
    }
}
