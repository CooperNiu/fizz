package com.thoughtworks;

public class FizzBuzz {
    public String result(int i) {
        String input = Integer.toString(i);
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String Whizz = "Whizz";



        if (i % 3 == 0 && i % 5 == 0 ) {
            input = "FizzBuzz";
        }
        else if (i % 3 == 0) {
            input = "Fizz";
        }
        else if (i % 5 == 0) {
            input = "Buzz";
        }

        return input;
    }
}
