package ru.job4j.array;

/*3. Объединить два отсортированных массива*/

import java.lang.reflect.Array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int rslIndex = 0;
      while (leftIndex < left.length && rslIndex < right.length) {
          if (left[leftIndex] < right[rightIndex]) {
              rsl[rslIndex] = left[leftIndex];
              rslIndex++;
              leftIndex++;
          } else if (left[leftIndex] == right[rightIndex]) {
              rsl[rslIndex] = left[leftIndex];
              rsl[rslIndex + 1] = right[rslIndex];
              leftIndex++;
              rightIndex++;
              rslIndex += 2;
          } else {
              rsl[rslIndex] = right[rightIndex];
              rslIndex++;
              rightIndex++;
          }
      }
        for (int i = leftIndex; i < left.length; i++) {
            rsl[rslIndex] = left[i];
            rslIndex++;
        }
        for (int i = rightIndex; i < right.length; i++) {
            rsl[rslIndex] = right[i];
            rslIndex++;
        }
        return rsl;
    }
}
