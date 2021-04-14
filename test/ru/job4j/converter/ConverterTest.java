package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert3EuroThen210rbl() {
      int  in = 3;
      int  expected = 210;
      int out = Converter.euroToRub(in);
      Assert.assertEquals(expected, out);

    }

    @Test
    public void whenConvert5usdThen300rbl() {
       int in = 5;
       int expected = 300;
       int out = Converter.usdToRub(in);
       Assert.assertEquals(expected, out);
    }
}