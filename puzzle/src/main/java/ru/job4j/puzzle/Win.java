package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkHorizontal(board, i) || checkVertical(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkHorizontal(int[][] array, int row) {
        boolean result = true;
        for (int i = 0; i < array[row].length; i++) {
            if (array[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkVertical(int[][] array, int column) {
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
