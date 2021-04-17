package ru.job4j.ru.job4j.loop;

/*Даны два целых числа a и b (a < b). Найти произведение всех целых чисел от a до b включительно.*/
public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int value = a;
        for (int i = a; i <= b; i++) {
            value *= i;
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(mult(1, 3));
    }
}