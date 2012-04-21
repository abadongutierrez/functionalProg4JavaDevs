package com.jabaddon.book.fp4jd.funtions;

import org.junit.Test;

public class ExerciseChapter2Test {
    @Test
    public void test_() {
        Function1<Object, Object> f1 = new Function1<Object, Object>() {

            @Override
            public Object apply(Object a) {
                return a + ":";
            }
        };
        System.out.println(m1(f1));
    }

    private Object m1(Function1<? super String, Object> function) {
        return function.apply("Hi there!");
    }
}
