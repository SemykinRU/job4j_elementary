package ru.job4j.ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class AbbreviationTest {

    @Test
    public void collect() {
        String s = "North Atlantic Treaty Organization";
        String rsl = Abbreviation.collect(s);
        Assert.assertEquals(rsl, "NATO");
    }

    @Test
    public void collect1() {
        String s = "Chief Executive Officer";
        String rsl = Abbreviation.collect(s);
        Assert.assertEquals(rsl, "CEO");
    }

    @Test
    public void collect2() {
        String s = "United Nations Organization";
        String rsl = Abbreviation.collect(s);
        Assert.assertEquals(rsl, "UNO");
    }

    @Test
    public void collect3() {
        String s = "E E C";
        String rsl = Abbreviation.collect(s);
        Assert.assertEquals(rsl, "EEC");
    }

    @Test
    public void collectIsEmpty() {
        String s = "               ";
        String rsl = Abbreviation.collect(s);
        Assert.assertEquals(rsl, "isEmpty");
    }

    @Test
    public void collect4() {
        String s = "Ute the Ute the ETRDS";
        String rsl = Abbreviation.collect(s);
        Assert.assertEquals(rsl, "UUETRDS");
    }
}