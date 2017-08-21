package com.knoldus.services;
import org.junit.Test;

import static org.junit.Assert.*;

public class PfiTest {

    @Test
    public void predicateTrueTest() {
        assertTrue(new Pfi().predicateTest(54));
    }

    @Test
    public void predicateFalseTest() {
        assertFalse(new Pfi().predicateTest(53));
    }

/*    @Test
    public void consumerTest() {
        assertEquals(new Pfi().consumerTest();
    }*/

}