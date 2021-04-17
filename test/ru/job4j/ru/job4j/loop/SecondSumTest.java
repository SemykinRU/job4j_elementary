package ru.job4j.ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondSumTest {

    @Test
    public void when1And2then1() {
        Assert.assertEquals(1, SecondSum.sum(1, 2));
    }

    @Test
    public void when1And3then4() {
        Assert.assertEquals(4, SecondSum.sum(1, 3));
    }

    @Test
    public void when1And5then9() {
        Assert.assertEquals(9, SecondSum.sum(1, 5));
    }

    @Test
    public void when0And5then6() {
        Assert.assertEquals(6, SecondSum.sum(0, 5));
    }
}