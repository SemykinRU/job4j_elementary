package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax10To5Then10() {
        int left = 10;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To9Then9() {
        int left = 7;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenFirst1Second10Third5Then10() {
        Assert.assertEquals(Max.max(1, 10, 5), 10);
    }

    @Test
    public void whenFirst100Second0Third50Fourth0Then100() {
        Assert.assertEquals(Max.max(100, 0, 50, 0), 100);
    }
}