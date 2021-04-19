package ru.job4j.array;

/*18. Суммирования предыдущих значений*/

public class SummingPrevious {

    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        if (n > 2) {
            array[2] = a + b;
            for (int i = 3; i < n; i++) {
                array[i] = array[i - 1] * 2;
            }
        }

        return array;
    }
}
