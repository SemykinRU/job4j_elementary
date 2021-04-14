package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when11to11then0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        int expected = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when106to72then5() {
        int x1 = 10;
        int y1 = 6;
        int x2 = 7;
        int y2 = 2;
        int expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when15to33then2d828() {
        int x1 = 1;
        int y1 = 5;
        int x2 = 3;
        int y2 = 3;
        double expected = 2.828;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}