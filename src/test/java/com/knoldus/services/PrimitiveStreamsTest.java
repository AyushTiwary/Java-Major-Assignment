package com.knoldus.services;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

import static org.junit.Assert.assertEquals;

public class PrimitiveStreamsTest {
    private Student student1 = new Student("ayush", 100);
    private Student student2 = new Student("sumit", 99);
    private Student student3 = new Student("atul", 100);
    private Student[] students = {student1, student2, student3};
    private PrimitiveStreams object = new PrimitiveStreams();

    @Test
    public void mapToInt() throws Exception {
        assertEquals(OptionalDouble.of(99.66666666666667), object.mapToInt(students));
    }

    @Test
    public void mapToObj() throws Exception {
        assertEquals(new ArrayList<Student>(Arrays.asList(student1, student2, student3)), object.mapToObj(new int[]{student1.getMarks(), student2.getMarks(),
                student3.getMarks()}));
    }

    @Test
    public void mapToDouble() throws Exception {
        assertEquals(OptionalDouble.of(99.66666666666667), object.mapToDouble(students));
    }

    @Test
    public void iterate() throws Exception {
        int limit = 4;
        assertEquals(Arrays.asList(1, 2, 4, 8), object.iterate(limit));
    }
}