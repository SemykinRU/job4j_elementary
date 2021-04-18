package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {100, -1, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-1, 0, 100};
        assertThat(expected, is(result));
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {100, -1, 0, -10, 22};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-10, -1, 0, 22, 100};
        assertThat(expected, is(result));
    }
}