package ru.job4j.array;

/*
48. Разность множеств
Разность множеств это операция при которой в результирующее множество попадают элементы из первого множества, но только если их нет во втором множестве.

Ваша задача реализовать эту операцию в коде. Множества заданы в виде массивов

Например,

{1}, {2} => {1}

{1}, {1} => {}

{1, 2}, {2} => {1}

{1}, {} => {1}
 */

import java.util.Arrays;

public class DiffArray {
    public static boolean isUnique(int[] array, int num) {
        for (int value : array) {
            if (num == value) {
                return false;
            }
        }
        return true;
    }

    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length];
        int index = 0;
        for (int value : left) {
            if (isUnique(right, value)) {
                rsl[index++] = value;
            }
        }
        return Arrays.copyOf(rsl, index);
    }
}
