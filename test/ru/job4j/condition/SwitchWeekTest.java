package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void whenMonday() {
        int in = 1;
        String expected = "Понедельник.";
        String out = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenTuesday() {
        int in = 2;
        String expected = "Вторник.";
        String out = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenWednesday() {
        int in = 3;
        String expected = "Среда.";
        String out = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenThursday() {
        int in = 4;
        String expected = "Четверг.";
        String out = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFriday() {
        int in = 5;
        String expected = "Пятница.";
        String out = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSaturday() {
        int in = 6;
        String expected = "Суббота.";
        String out = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSunday() {
        int in = 7;
        String expected = "Воскресенье.";
        String out = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenError() {
        int in = -1;
        String expected = "Ошибка.";
        String out = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, out);
    }
}