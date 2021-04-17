package ru.job4j.ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SectionCountTest {

    @Test
    public void when2And1then2() {
        Assert.assertEquals(2, SectionCount.count(2, 1));
    }

    @Test
    public void when3And2then1() {
        Assert.assertEquals(1, SectionCount.count(3, 2));
    }

    @Test
    public void when10And1then10() {
        Assert.assertEquals(10, SectionCount.count(10, 1));
    }

    @Test
    public void when5And2then2() {
        Assert.assertEquals(2, SectionCount.count(5, 2));
    }
}