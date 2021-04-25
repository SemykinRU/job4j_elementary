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

    @Test
    public void when050to333then4d69() {
        Point point1 = new Point(0, 5, 0);
        Point point2 = new Point(3, 3, 3);
        Assert.assertEquals(4.69, point1.distance3d(point2), 0.01);
    }

    @Test
    public void when153to000then5d91() {
        Point point1 = new Point(1, 5, 3);
        Point point2 = new Point(0, 0, 0);
        Assert.assertEquals(5.91, point1.distance3d(point2), 0.01);
    }

    @Test
    public void whenMinus3Minus7Plus3toMinus200then7d68() {
        Point point1 = new Point(-3, -7, 3);
        Point point2 = new Point(-2, 0, 0);
        Assert.assertEquals(7.68, point1.distance3d(point2), 0.01);
    }
}