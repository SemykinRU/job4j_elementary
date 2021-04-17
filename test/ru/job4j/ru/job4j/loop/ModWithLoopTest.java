package ru.job4j.ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModWithLoopTest {

    @Test
    public void when4And2then0() {
        Assert.assertEquals(0, ModWithLoop.mod(4, 2));
    }

    @Test
    public void when3And2then1() {
        Assert.assertEquals(1, ModWithLoop.mod(3, 2));
    }

    @Test
    public void when8And3then2() {
        Assert.assertEquals(2, ModWithLoop.mod(8, 3));
    }

    @Test
    public void when0And3then0() {
        Assert.assertEquals(0, ModWithLoop.mod(0, 3));
    }
}