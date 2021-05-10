package ru.job4j.array;

/*
46. Пересечение множеств
Множество - это набор уникальных элементов. Пересечение множеств - это такая операция, когда в результирующее множество попадают только элементы, которые есть в обоих множествах. Если нет такие элементов, то результат пустое множество.

Ваша задача реализовать данную операцию в коде. Множества заданы массивами

Например,

{1, 2} и {3, 4} => {}, нет общих элементов

{1, 2} и {1, 3, 4} => {1}, 1 общий элемент

{1, 2} и {1, 2, 3, 4} => {1, 2}, 1 и 2 общие элементы
*/

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int count = Math.max(left.length, right.length);
        int indexRsl = 0;
        int[] rsl = new int[count];
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (right[i] == left[j]) {
                    rsl[indexRsl++] = right[i];
                }
            }
        }
        return Arrays.copyOf(rsl, indexRsl);
    }
}
