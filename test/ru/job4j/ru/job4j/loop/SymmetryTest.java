package ru.job4j.ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class SymmetryTest {

    @Test
    public void checkTrue() {
        boolean check = Symmetry.check(1112111);
        Assert.assertTrue(check);
    }

    @Test
    public void checkTrue2() {
        boolean check = Symmetry.check(123321);
        Assert.assertTrue(check);
    }

    @Test
    public void checkFalse() {
        boolean check = Symmetry.check(123456321);
        Assert.assertFalse(check);
    }

    @Test
    public void checkFalse2() {
        boolean check = Symmetry.check(10);
        Assert.assertFalse(check);
    }

    @Test
    public void checkFalse3() {
        boolean check = Symmetry.check(9);
        Assert.assertFalse(check);
    }
}