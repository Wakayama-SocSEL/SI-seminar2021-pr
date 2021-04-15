package com.example.seminar;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppIllegalTest {
    protected ByteArrayOutputStream out;

    protected void assertError(String message, String[] args) {
        FizzBuzz.main(args);

        assertEquals(message, message + System.lineSeparator(), out.toString());
    }

    @Before
    public void setUp() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testNegativeArgument() {
    }

    @Test
    public void testZeroArgument() {
    }

    @Test
    public void testFloatArgument() {
    }

    @Test
    public void testStringArgument() {
    }

    @Test
    public void testOneArgument() {
    }

    @Test
    public void testOneNegativeArgument() {
    }

    @Test
    public void testOneZeroArgument() {
    }

    @Test
    public void testOneFloatArgument() {
    }

    @Test
    public void testOneStringArgument() {
    }

    @Test
    public void testManyArgument() {
    }

    @Test
    public void testManyNegativeArgument() {
    }

    @Test
    public void testManyZeroArgument() {
    }

    @Test
    public void testManyFloatArgument() {
    }

    @Test
    public void testManyStringArgument() {
    }
}
