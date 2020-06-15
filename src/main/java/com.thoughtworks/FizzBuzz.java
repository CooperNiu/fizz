package com.thoughtworks;

public class FizzBuzz {
    public String result(int i) {
        String input = Integer.toString(i);
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String Whizz = "Whizz";

        if (input.contains("7")) {
            input = Whizz;
        } else if (input.contains("5")) {
            input = Buzz;
        } else if (input.contains("3")) {
            input = Fizz;
        } else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
            input = "FizzBuzzWhizz";
        } else if (i % 3 == 0 && i % 7 == 0) {
            input = "FizzWhizz";
        } else if (i % 5 == 0 && i % 7 == 0) {
            input = "BuzzWhizz";
        } else if (i % 3 == 0 && i % 5 == 0) {
            input = "FizzBuzz";
        } else if (i % 3 == 0) {
            input = "Fizz";
        } else if (i % 5 == 0) {
            input = "Buzz";
        } else if (i % 7 == 0) {
            input = "Whizz";
        }

        return input;
    }

    
}
