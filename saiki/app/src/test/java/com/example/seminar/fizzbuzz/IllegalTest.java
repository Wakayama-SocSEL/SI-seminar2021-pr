package com.example.seminar.fizzbuzz;

import com.example.seminar.FizzBuzz;

import org.junit.BeforeClass;
import org.junit.Test;

public class IllegalTest {
    protected static FizzBuzz app;

    @BeforeClass
    public static void setUpOnce() {
        app = new FizzBuzz();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgument() {
        int start = 10;
        int end = 5;

        app.execute(start, end);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeStartArgument() {
        int start = -5;
        int end = 5;

        app.execute(start, end);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeEndArgument() {
        int start = 5;
        int end = -5;

        app.execute(start, end);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeArgument() {
        int start = -10;
        int end = -10;

        app.execute(start, end);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOverflowArgument() {
        int start = 60;
        int end = 70;

        app.execute(start, end);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroArgument() {
        int start = 0;
        int end = 0;

        app.execute(start, end);
    }
}
