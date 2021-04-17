package ru.job4j.ru.job4j.loop;
/* Дано целое число price — цена 1 кг конфет. Вывести стоимость 1, 2, . . . , 5 кг конфет.*/
public class SweetPrice {
    public static void out(int price) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(price * i);
        }
    }

    public static void main(String[] args) {
        SweetPrice.out(10);
    }
}
