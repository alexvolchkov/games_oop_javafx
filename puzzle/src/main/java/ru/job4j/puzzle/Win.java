package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                rsl = checkHorizontal(board[i]) || checkVertical(board, i);
                if (rsl) {
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean checkHorizontal(int[] array) {
        boolean result = true;
        for (int el : array) {
            if (el != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkVertical(int[][] array, int ceil) {
        boolean result = true;
        for (int[] el : array) {
            if (el[ceil] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
