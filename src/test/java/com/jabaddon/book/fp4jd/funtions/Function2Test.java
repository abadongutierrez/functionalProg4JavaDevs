package com.jabaddon.book.fp4jd.funtions;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItems;

public class Function2Test {

    @Test
    public void sumFunction2() {
        Function2<Long, Long, Long> sum = new Function2<Long, Long, Long>() {
            @Override
            public Long apply(Long aLong, Long aLong1) {
                return aLong.longValue() + aLong1.longValue();
            }
        };

        assertThat(sum.apply(1L, 2L), is(3L));
    }    
}
