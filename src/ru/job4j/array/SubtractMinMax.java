package ru.job4j.array;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int min = ints[0];
        int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (max < ints[j]) {
                    max = ints[i];
                } else if (min > ints[j]) {
                    min = ints[i];
                }
            }
        }

        return max - min;
    }
}
