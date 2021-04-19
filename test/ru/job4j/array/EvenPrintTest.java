package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EvenPrintTest {

    @Test
    public void whenNonEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        EvenPrint.print(new int[] {1, 2, 3, 4});
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("4" + ln + "2" + ln));
    }

    @Test
    public void whenEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        EvenPrint.print(new int[] {1, 3, 5});
        assertThat(out.toString(), is(""));
    }

    /*@Test
    public void myTest() {
        int[] in = new int[] {10, 1, 2, 3, 10, 8, 5, 70};
        int[] out = EvenPrint.print(in);
        int[] expected = new int[]{70, 10, 10, 8, 2};
        Assert.assertArrayEquals(expected, out);

    }*/
}