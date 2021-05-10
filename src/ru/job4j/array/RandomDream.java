package ru.job4j.array;

/*44. Поле чудес
        Дан массив призов и положительное число, которое сгенерировано случайно. Ваша задача получить приз

        Например,

        {"автомобиль", "квартира", "билет"} и число = 1 => "автомобиль"

        {"автомобиль", "квартира", "билет"} и число = 2 => "квартира"

        {"автомобиль", "квартира", "билет"} и число = 4 => "автомобиль"

        {"автомобиль", "квартира", "билет"} и число = 99 => "билет"*/

public class RandomDream {
    public static String random(String[] prizes, int num) {
        if (num <= prizes.length) {
            return prizes[num - 1];
        } else {
            do {
                num -= prizes.length;
            } while (num > prizes.length);
        }
        return prizes[num - 1];
    }
}
