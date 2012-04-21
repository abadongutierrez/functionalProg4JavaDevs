package com.jabaddon.book.fp4jd.funtions;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItems;

public class Function1VoidTest {

    @Test
    public void aFunctionToAddItemsToAList() {
        final List<String> lista = new ArrayList<String>();
        Function1Void<String> f1 = new Function1Void<String>() {
            @Override
            public void apply(String s) {
                lista.add(s);
            }
        };

        f1.apply("Hola!");
        f1.apply("como");
        f1.apply("estan!?");

        assertThat(lista.size(), is(3));
        assertThat(lista, hasItems("Hola!", "como", "estan!?"));
    }
}
