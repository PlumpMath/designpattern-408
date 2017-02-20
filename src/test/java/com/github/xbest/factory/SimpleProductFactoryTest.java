package com.github.xbest.factory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by link on 2017/2/20.
 */
public class SimpleProductFactoryTest {
    @Test
    public void getInstance() throws Exception {
        assertEquals(SimpleProductA.class,SimpleProductFactory.getInstance("productA").getClass());
        assertEquals(SimpleProductB.class,SimpleProductFactory.getInstance("productB").getClass());
        assertNotEquals(SimpleProductB.class,SimpleProductFactory.getInstance("productA").getClass());
        assertNotEquals(SimpleProductA.class,SimpleProductFactory.getInstance("productB").getClass());
        assertEquals(null,SimpleProductFactory.getInstance("xxx"));
    }

}