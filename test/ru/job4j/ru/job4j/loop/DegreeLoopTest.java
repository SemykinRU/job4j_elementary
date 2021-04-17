package ru.job4j.ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DegreeLoopTest {

    @Test
    public void when2And2then4() {
        Assert.assertEquals(4, DegreeLoop.calculate(2, 2));
    }

    @Test
    public void when1And100then1() {
        Assert.assertEquals(1, DegreeLoop.calculate(1, 100));
    }

    @Test
    public void when3And3then27() {
        Assert.assertEquals(27, DegreeLoop.calculate(3, 3));
    }
}