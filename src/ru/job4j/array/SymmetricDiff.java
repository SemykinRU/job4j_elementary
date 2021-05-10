package ru.job4j.array;

/*
49. Симметрическая разность множеств
Симметрическая разность - это такая операция, когда в результирующее множество попадают все элементы из обоих множеств, кроме тех, которые есть и в том и в другом множествах.

Ваша задача реализовать эту операцию. Множества заданы в виде массивов.

Например,

{1}, {2} => {1, 2}

{1, 2}, {2, 3} => {1, 3}

{1}, {} => {1}
 */

import java.util.Arrays;

public class SymmetricDiff {

    public static boolean isNotUnique(int[] array, int num) {
        for (int value : array) {
            if (value == num) {
                return false;
            }
        }
        return true;
    }

    public static int[] diff(int[] left, int[] right) {

        int[] rsl = new int[left.length + right.length];
        int index = 0;
        for (int value : left) {
            if (isNotUnique(right, value)) {
                rsl[index++] = value;
            }
        }
        for (int value : right) {
            if (isNotUnique(left, value)) {
                rsl[index++] = value;
            }
        }

        return Arrays.copyOf(rsl, index);
    }
}
