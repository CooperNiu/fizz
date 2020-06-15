package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_1_given_1() {
        should_return_expect_given_number(1, "1");
    }

    @Test
    public void should_return_Fizz_given_3() {
        should_return_expect_given_number(3, "Fizz");
    }

    @Test
    public void should_return_Buzz_given_5() {
        should_return_expect_given_number(5, "Buzz");
    }

    @Test
    public void should_return_Whizz_given_7() {
        should_return_expect_given_number(7, "Whizz");
    }

    @Test
    public void should_return_FizzBuzz_given_60() {
        should_return_expect_given_number(60, "FizzBuzz");
    }
    @Test
    public void should_return_BuzzWhizz_given_140() {
        should_return_expect_given_number(140, "BuzzWhizz");
    }
    @Test
    public void should_return_FizzBuzz_given_21() {
        should_return_expect_given_number(21, "FizzWhizz");
    }
    @Test
    public void should_return_FizzBuzz_given_15() {
        should_return_expect_given_number(15, "Buzz");
    }
    @Test
    public void should_return_FizzBuzz_given_37() {
        should_return_expect_given_number(37, "Whizz");
    }
    @Test
    public void should_return_FizzBuzz_given_23() {
        should_return_expect_given_number(23, "Fizz");
    }

    void should_return_expect_given_number(int number, String expect) {
//        given
        FizzBuzz fizzBuzz = new FizzBuzz();
//        when
        String actual = fizzBuzz.result(number);
//        then
        assertThat(actual, is(expect));
    }
}
