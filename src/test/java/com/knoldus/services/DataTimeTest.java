package com.knoldus.services;

import org.junit.Test;
import static org.junit.Assert.*;

public class DataTimeTest {

    @Test
    public void ageOfPersonTest(){

        DataTime period = new DataTime();
        String result = period.ageOfPerson();

        assertEquals(result, "Your age is 21 years, 8 months & 2 days!");
    }

}