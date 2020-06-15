package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_1_given_1() {
        should_return_expect_given_number(1,"1");
    }
    void should_return_expect_given_number(int number, String expect)
    {
//        given
        FizzBuzz fizzBuzz = new FizzBuzz();
//        when
        String actual = fizzBuzz.result(number);
//        then
        assertThat(actual, is(expect));
    }
}
