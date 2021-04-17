package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] resultArray = Turn.back(input);
        int[] expected = new int[] {5, 4, 3, 2, 1};
     assertThat(resultArray, is(expected));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArrayFrom1to11() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] resultArray = Turn.back(input);
        int[] expected = new int[] {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(resultArray, is(expected));
    }
}