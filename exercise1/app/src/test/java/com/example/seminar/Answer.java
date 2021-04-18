package com.example.seminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answer {
    private List<String> answerList;

    public Answer() {
        answerList = new ArrayList<String>(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
                "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23",
                "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "31", "32", "Fizz", "34", "Buzz", "Fizz", "37",
                "38", "Fizz", "Buzz", "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz"));
    }

    public String makeExpected(int start, int end) throws IndexOutOfBoundsException {
        return String.join(",", answerList.subList(start - 1, end));
    }
}
