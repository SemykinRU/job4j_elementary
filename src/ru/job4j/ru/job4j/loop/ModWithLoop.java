package ru.job4j.ru.job4j.loop;

/*Есть операция остаток от деления %. Вам даны два целых положительных числа числа n и d (d > 0). */
/* n это делимое, d это делитель. Вам нужно не используя операцию %, найти остаток от деления. */

public class ModWithLoop {
    public static int mod(int n, int d) {
        int value = 0;
        while (n >= d) {
            n -= d;
            value = n;
        }
        return value;
    }
}
