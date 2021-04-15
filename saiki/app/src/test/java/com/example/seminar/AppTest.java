package com.example.seminar;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    protected ByteArrayOutputStream out;
    protected static Answer answer;

    protected void assertExecute(int start, int end) throws IllegalArgumentException {
        if (start <= 0 || end <= 0) {
            throw new IllegalArgumentException("must be positive");
        } else if (start > end) {
            throw new IllegalArgumentException("end must be greater than start");
        }

        String expected = answer.makeExpected(start, end);
        String[] args = { String.valueOf(start), String.valueOf(end) };

        FizzBuzz.main(args);

        assertEquals(String.format("%d~%dの結果", start, end), expected + System.lineSeparator(), out.toString());
    }

    @BeforeClass
    public static void setUpOnce() {
        answer = new Answer();
    }

    @Before
    public void setUp() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testDefault() {
        String expected = answer.makeExpected(1, 25);
        String[] args = {};

        FizzBuzz.main(args);

        assertEquals("引数なしの時の出力", expected + System.lineSeparator(), out.toString());
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
