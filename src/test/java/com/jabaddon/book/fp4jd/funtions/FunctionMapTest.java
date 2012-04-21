package com.jabaddon.book.fp4jd.funtions;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItems;

public class FunctionMapTest {
    @Test
    public void mapFunction() {
        List<Long> nums = new ArrayList<Long>();
        nums.add(2L);
        nums.add(4L);
        nums.add(6L);

        Function1<Long, Long> times2 = new Function1<Long, Long>() {
            @Override
            public Long apply(Long a) {
                return a * 2;
            }
        };
        List<Long> nums2 = new FunctionMap<Long>().apply(nums, times2);

        assertThat(nums2, hasItems(4L, 8L, 12L));

        Function1<Long, Long> plus2 = new Function1<Long, Long>() {
            @Override
            public Long apply(Long item) {
                return item + 2;
            }
        };
        List<Long> newList = new FunctionMap<Long>().apply(nums, plus2);
        assertThat(newList, hasItems(4L, 6L, 8L));
    }
}
