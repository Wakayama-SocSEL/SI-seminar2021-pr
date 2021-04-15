package com.example.seminar;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private String judgeFizzBuzz(int num) {
        assert num > 0 : "argument must be positive";

        boolean fizz = (num % 3 == 0);
        boolean buzz = (num % 5 == 0);

        if (fizz && buzz) {
            return "FizzBuzz";
        } else if (fizz) {
            return "Fizz";
        } else if (buzz) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }

    public String execute(int start, int end) throws IllegalArgumentException {
        if (start <= 0 || end <= 0) {
            throw new IllegalArgumentException("arguments must be positive");
        } else if (start > 50 || end > 50) {
            throw new IllegalArgumentException("arguments must be lower than 50");
        } else if (start > end) {
            throw new IllegalArgumentException("end must be greater than start");
        }

        List<String> result = new ArrayList<String>();

        for (int i = start; i <= end; i++) {
            result.add(judgeFizzBuzz(i));
        }

        return String.join(",", result);
    }

    public static void main(String[] args) {
        try {
            int start, end;
            if (args.length == 0) {
                start = 1;
                end = 25;
            } else if (args.length == 2) {
                start = Integer.parseInt(args[0]);
                end = Integer.parseInt(args[1]);
            } else {
                throw new IllegalArgumentException("must have 2 arguments");
            }

            System.out.println(new FizzBuzz().execute(start, end));

        } catch (NumberFormatException e) {
            System.out.println("arguments must be integers");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
