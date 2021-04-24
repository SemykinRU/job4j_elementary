package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when11to11then0() {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(1, 1);
        Assert.assertEquals(0, point1.distance(point2), 0.01);
    }

    @Test
    public void when106to72then5() {
        Point point1 = new Point(10, 6);
        Point point2 = new Point(7, 2);
        Assert.assertEquals(5, point1.distance(point2), 0.01);
    }

    @Test
    public void when15to33then2d828() {
        Point point1 = new Point(1, 5);
        Point point2 = new Point(3, 3);
        Assert.assertEquals(2.828, point1.distance(point2), 0.01);
    }
}