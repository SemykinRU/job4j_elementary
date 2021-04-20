package ru.job4j.array;

/*Если последовательность элементов удовлетворяет условию Ak <= Ak+1 <= ... <= Ak+m она называется неубывающей.
Длина последовательности это количество элементов, которые в нее входят.
В массиве таких последовательностей может быть несколько, вам нужно найти длину максимальной из них.*/

public class MaxLengthSeria {
    public static int find(int[] array) {
        int min = 1;
        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] >= array[i]) {
                min += 1;
            } else {
                if (min > max) {

                    max = min;
                    min = 1;
                }
            }
        }
        return min;
    }
}
