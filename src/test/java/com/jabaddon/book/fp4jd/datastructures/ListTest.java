package com.jabaddon.book.fp4jd.datastructures;

import org.junit.Test;

import static com.jabaddon.book.fp4jd.datastructures.ListModule.*;
import static org.junit.Assert.assertEquals;

public class ListTest {
    List<String> EMPTYLS = emptyList();
    List<Long> EMPTYLL = emptyList();

    @Test(expected = EmptyListHasNoHead.class)
    public void callingHeadOnAnEmptyListRaises() {
        EMPTYLS.head();
    }

    @Test(expected = EmptyListHasNoTail.class)
    public void callingTailOnAnEmptyListRaises() {
        EMPTYLS.tail();
    }

    @Test
    public void callingTailOnAListWithMultipleElementsReturnANonEmptyList() {
        List<String> tail = list("one", list("two", EMPTYLS)).tail();
        assertEquals(list("two", EMPTYLS), tail);
    }

    @Test
    public void callingHeadOnANonEmptyListReturnsTheHead() {
        String head = list("one", EMPTYLS).head();
        assertEquals("one", head);
    }

    @Test
    public void allEmptyListAreEqual() {
        assertEquals(EMPTYLS, EMPTYLL);
    }

    @Test
    public void listAreRecursiveStructures() {
        List<String> list1 = list("one", list("two", list("three", EMPTYLS)));
        assertEquals("(one, (two, (three, ())))", list1.toString());
    }
}
