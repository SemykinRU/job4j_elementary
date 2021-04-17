package ru.job4j.ru.job4j.loop;
/*Метод принимает целочисленное значение. Необходимо проверить является ли оно симметричным или нет. */
/*Симметричным считается число которое в котором числа идущие по порядку в прямом и обратном порядке равны друг другу.*/

public class Symmetry {
    public static boolean check(int i) {
        boolean isTrue = true;
        if (i <= 9) {
          isTrue = false;
        } else {
            String str = String.valueOf(i);
            int temValue = str.length();
            for (int j = 0; j <= str.length() / 2; j++) {
                if (str.charAt(j) != str.charAt(temValue - 1)) {
                    isTrue = false;
                    break;
                }
                temValue--;
            }
        }
                 return isTrue;
            }
}

