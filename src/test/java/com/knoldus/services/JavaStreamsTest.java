package com.knoldus.services;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class JavaStreamsTest {

    private int length = 5;
    private JavaStreams object = new JavaStreams();
    private String[] names = {"ayush", "tiwari", "atul"};
    private int[] numArray = {7, 5, 2, 5, 1};

    @Test
    public void allMatch() throws Exception {
        assertFalse(object.allMatch(length));
    }

    @Test
    public void anyMatch() throws Exception {
        assertTrue(object.anyMatch(length));
    }

    @Test
    public void noneMatch() throws Exception {
        assertFalse(object.noneMatch(length));
    }

    @Test
    public void collect() throws Exception {
        assertEquals("ayush,tiwari,atul",object.collect(names));
    }

    @Test
    public void count() throws Exception {
        assertEquals(names.length,object.count(names));
    }

    @Test
    public void findAny() throws Exception {
        assertEquals(Optional.of(names[0]),object.findAny(names));
    }

    @Test
    public void findFirst() throws Exception {
        assertEquals(Optional.of(names[0]),object.findFirst(names));
    }

}