package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K3then0d75() {
        int p = 4;
        double k = 3;
        double expected = 0.75;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K6then3d06() {
        int p = 10;
        double k = 6;
        double expected = 3.06;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}