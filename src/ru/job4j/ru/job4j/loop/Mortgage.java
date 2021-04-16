package ru.job4j.ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
         while (true) {
              if ((amount + (amount * percent / 100)) <= salary){
                  year++;
                  break;
              }else {
                  amount = (amount + (int) (amount * percent) / 100) - salary;
                  year++;
              }
            }
        return year;
    }
}
