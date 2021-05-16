package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }
    
     @Test
    public void whenMax2To1Then4() {
         int first = 1;
         int second = 2;
         int third = 3;
         int result = Max.max(first, second, third);
         int expected = 3;
         Assert.assertEquals(result, expected);
    }

    @Test
    public void whenEqual() {
        int first = 1;
        int second = 2;
        int third = 3;
        int forth = 4;
        int result = Max.max(first, second, third, forth);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}
