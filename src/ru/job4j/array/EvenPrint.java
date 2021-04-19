package ru.job4j.array;

//Вывести четные в порядке убывания индексов
import java.util.Arrays;

public class EvenPrint {
    public static void print(int[] array) {
        int index = 0;
        int temp = 0;
        /*Проверяем сколько всего четных чисел в массиве, что бы создать новый массив*/
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                index++;
            }
        }
        /*Создаем новый массив для заполнения четными числами из принятого массива*/
        int[] newArray = new int[index];
        index = 0; //Сбрасываем счетчик для заполнения нового массива

        /*Заполняем наш массив четными числами из принятого массива*/
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArray[index] = array[i];
                index++;
            }
        }

        /*Сортируем наш массив по убыванию.*/
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (newArray[i] >= newArray[j]) {
                    temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        /*Выводим массив на экран.*/
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}

