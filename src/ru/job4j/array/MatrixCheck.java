package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = row; i == row; i++) {
            for (int cell = 0; cell < board[row].length - 1; cell++) {
                if (board[i][cell] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
