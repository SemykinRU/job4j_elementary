package ru.job4j.ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom1To20nThen110() {
        int start = 1;
        int finish = 20;
        int result = Counter.sumByEven(start, finish);
        int expected = 110;
        Assert.assertEquals(expected, result);
    }
}