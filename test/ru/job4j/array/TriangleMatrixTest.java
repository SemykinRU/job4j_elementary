package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleMatrixTest {

    @Test
    public void rows() {
        int in = 3;
        int[][] out = TriangleMatrix.rows(in);
        int[][] expected = {{1}, {2, 3}, {4, 5, 6}};
        assertArrayEquals(expected, out);
    }
}