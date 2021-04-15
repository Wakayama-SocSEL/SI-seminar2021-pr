package com.example.seminar.fizzbuzz;

import static org.junit.Assert.*;

import com.example.seminar.Answer;
import com.example.seminar.FizzBuzz;

import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {

    protected static Answer answer;
    protected static FizzBuzz app;

    protected void assertExecute(int start, int end) throws IllegalArgumentException {
        if (start <= 0 || end <= 0) {
            throw new IllegalArgumentException("must be positive");
        } else if (start > end) {
            throw new IllegalArgumentException("end must be greater than start");
        }

        String expected = answer.makeExpected(start, end);

        String result = app.execute(start, end);

        assertEquals(String.format("%d~%dの結果", start, end), expected, result);
    }

    @BeforeClass
    public static void setUpOnce() {
        answer = new Answer();
        app = new FizzBuzz();
    }

    @Test
    public void testUpper1() {
        assertExecute(1, 1);
    }

    @Test
    public void testUpper10() {
        assertExecute(1, 10);
    }

    @Test
    public void testUpper40() {
        assertExecute(1, 40);
    }

    @Test
    public void testLower5() {
        assertExecute(5, 25);
    }

    @Test
    public void testLower10() {
        assertExecute(10, 25);
    }

    @Test
    public void testSlice5_10() {
        assertExecute(5, 10);
    }

    @Test
    public void testSlice7_30() {
        assertExecute(7, 30);
    }

    @Test
    public void testSlice35_50() {
        assertExecute(35, 50);
    }

    @Test
    public void testSlice5_5() {
        assertExecute(5, 5);
    }

    @Test
    public void testSlice15_15() {
        assertExecute(15, 15);
    }

    @Test
    public void testSlice30_30() {
        assertExecute(30, 30);
    }
}
