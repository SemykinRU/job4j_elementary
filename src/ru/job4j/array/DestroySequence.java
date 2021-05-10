package ru.job4j.array;

/*45. Разрушение бинарного кода
        Представьте, что вы связист на войне. Вы отловили сигнал противника, ваша задача испортить его. Вы решили это сделать следующим образом, заменить первые 5 символов 0, а последние 5 символов 1.

        Длина исходной последовательности >= 10*/

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        int lastIndex = seq.length - 1;
        int index = 0;
        while (index < 5) {
            seq[index++] = '0';
            seq[lastIndex--] = '1';
        }
        return seq;
    }
}
