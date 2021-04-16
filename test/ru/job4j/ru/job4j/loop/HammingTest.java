package ru.job4j.ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HammingTest {

    @Test
    public void checkStringsIs3() {
        int rsl = Hamming.checkStrings("2173896", "2233796");
        Assert.assertEquals(rsl, 3);
    }

    @Test
    public void checkStringsIs5() {
        int rsl = Hamming.checkStrings("abcde", "bcdef");
        Assert.assertEquals(rsl, 5);
    }

    @Test
    public void checkStringsIs0() {
        int rsl = Hamming.checkStrings("abcde", "abcde");
        Assert.assertEquals(rsl, 0);
    }
}