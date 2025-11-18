package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class BasicPlayTest 
{
    // fields for the test class

    @Before
    public void setup() {

    }

    @Test
    public void testCallAFunction() {
        assertEquals(true, App.returnTrue());
    }
}
