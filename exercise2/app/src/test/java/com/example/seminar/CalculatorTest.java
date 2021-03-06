/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example.seminar;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private int sum(int[] args) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            result += args[i];
        }
        return result;
    }

    @Test
    public void testSum() {
        int[] data = new int[]{2, 4, 6, 8, 10, 12};
        int[] calculated = Calculator.calculate(data);
        int expected = sum(data);
        int actual = sum(calculated);
        assertEquals("計算後の合計単位数が計算前と等しい", expected, actual);
    }

    @Test
    public void testLimit() {
        int[] data = new int[]{32, 26, 34, 18, 16, 10};
        int[] calculated = Calculator.calculate(data);
        boolean expected = true;
        for (int i = 0; i < calculated.length - 1; i++) {
            boolean actual = calculated[i] <= Calculator.youken[i];
            assertEquals("計算後の自由選択以外の単位数が卒業要件以下", expected, actual);
        }
    }

    @Test
    public void testDaiichiMajor() {
        int[] data = new int[]{0, 0, 34, 0, 0, 0};
        int[] expected = new int[]{0, 0, 32, 0, 2, 0};
        int[] calculated = Calculator.calculate(data);
        for (int i = 0; i < expected.length - 1; i++) {
            assertEquals("第一メジャーの余剰をその他メジャーに回す", expected[i], calculated[i]);
        }
    }

    @Test
    public void testDainiMajor() {
        int[] data = new int[]{0, 0, 0, 18, 0, 0};
        int[] expected = new int[]{0, 0, 0, 16, 2, 0};
        int[] calculated = Calculator.calculate(data);
        for (int i = 0; i < expected.length - 1; i++) {
            assertEquals("第二メジャーの余剰をその他メジャーに回す", expected[i], calculated[i]);
        }
    }

    @Test
    public void testSonotaMajor() {
        int[] data = new int[]{0, 0, 0, 0, 16, 0};
        int[] expected = new int[]{0, 0, 0, 0, 14, 2};
        int[] calculated = Calculator.calculate(data);
        for (int i = 0; i < expected.length - 1; i++) {
            assertEquals("その他メジャーの余剰を自由選択に回す", expected[i], calculated[i]);
        }
    }

    @Test
    public void testKyouyou() {
        int[] data = new int[]{32, 0, 0, 0, 0, 0};
        int[] expected = new int[]{30, 0, 0, 0, 0, 2};
        int[] calculated = Calculator.calculate(data);
        for (int i = 0; i < expected.length - 1; i++) {
            assertEquals("教養の余剰を自由選択に回す", expected[i], calculated[i]);
        }
    }

    @Test
    public void testKiso() {
        int[] data = new int[]{0, 26, 0, 0, 0, 0};
        int[] expected = new int[]{0, 24, 0, 0, 0, 2};
        int[] calculated = Calculator.calculate(data);
        for (int i = 0; i < expected.length - 1; i++) {
            assertEquals("基礎の余剰を自由選択に回す", expected[i], calculated[i]);
        }
    }
}
