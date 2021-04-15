package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test

    public void whenMondayThen1() {
        String in = "Понедельник";
        int excepted = 1;
        int out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
        in = "Monday";
        out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
    }

    @Test

    public void whenTuesdayThen2() {
        String in = "Вторник";
        int excepted = 2;
        int out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
        in = "Tuesday";
        out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
    }

    @Test

    public void whenWednesdayThen3() {
        String in = "Среда";
        int excepted = 3;
        int out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
        in = "Wednesday";
        out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
    }

    @Test

    public void whenThursdayThen4() {
        String in = "Четверг";
        int excepted = 4;
        int out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
        in = "Thursday";
        out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
    }

    @Test

    public void whenFridayThen5() {
        String in = "Пятница";
        int excepted = 5;
        int out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
        in = "Friday";
        out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
    }

    @Test

    public void whenSaturdayThen6() {
        String in = "Суббота";
        int excepted = 6;
        int out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
        in = "Saturday";
        out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
    }

    @Test

    public void whenSundayThen7() {
        String in = "Воскресенье";
        int excepted = 7;
        int out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
        in = "Sunday";
        out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
    }

    @Test

    public void whenErrorThenMinus1() {
        String in = "По4";
        int excepted = -1;
        int out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
        in = "345df";
        out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(excepted, out);
    }
}