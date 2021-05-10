package ru.job4j.array;

/*
47. Объединение множеств
Объединение множеств это такая операция при которой в результирующее множество попадают элементы, которые есть хотя бы в одном множестве.

Ваша задача реализовать эту операцию. Множества заданы в виде массива

Например,

{1}, {2} => {1, 2}

{1, 2}, {2} => {1, 2}

{1, 2}, {3} => {1, 2, 3}

{1}, {} => {1}
 */

import java.util.Arrays;

public class OrArray {

    public static boolean isUnique(int[] array, int num) {
        for (int value : array) {
            if (num == value) {
                return false;
            }
        }
        return true;
    }

    public static int[] or(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int rslIndex = 0;
        for (int value : left) {
            if (isUnique(right, value)) {
                rsl[rslIndex++] = value;
            }
        }
        for (int value : right) {
            if (isUnique(rsl, value)) {
                rsl[rslIndex++] = value;
            }
        }
        return Arrays.copyOf(rsl, rslIndex);
    }
}
