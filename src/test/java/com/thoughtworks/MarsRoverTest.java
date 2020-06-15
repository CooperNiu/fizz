package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_init_given_position() {
        //given
        String[] commands = new String[4];
        commands[0] = "(0,0)N";
        //when
        MarsRover actual = new MarsRover(commands);

        //then
        assertEquals(actual.position,"(0,0)N");
    }

    @Test
    public void should_north_given_N() {
        //given
        String[] commands = new String[4];
        commands[0] = "MMMM";
        //when
        MarsRover actual = new MarsRover(commands);

        //then
        assertEquals(actual.position,"(0,4)N");
    }
}
