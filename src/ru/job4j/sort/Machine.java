package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int changeValue = money - price;
        for (int i = 0; i < coins.length; i++) {
                while (changeValue - coins[i] >= 0) {
                    rsl[size++] = coins[i];
                    changeValue -= coins[i];
                }
            }
        return Arrays.copyOf(rsl, size);
    }
}
