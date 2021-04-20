package ru.job4j.array;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        int value = 0;
        boolean isTrue = false;
        for (int i = 0; i < data.length; i++) {
            value += data[i];
        }
        if (value % 2 == 0) {
            isTrue = true;
        }

        return isTrue;
    }
}
