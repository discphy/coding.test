package com.discphy.code.programmers.woowa;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.lang.String.join;
import static java.util.Arrays.stream;
import static org.assertj.core.api.Assertions.assertThat;

public class TechCamp2023Real_2_Test {

    @Test
    void solution1TestCase1() {
        String[] board = new String[]{"EEEEE", "EEMEE", "EEEEE", "EEEEE"};
        int y = 2;
        int x = 0;

        String[] result = solution(board, y, x);
        System.out.println("result = " + Arrays.toString(result));

        assertThat(result).containsExactly("B1E1B", "B1E1B", "B111B", "BBBBB");
    }

    @Test
    void solution1TestCase2() {
        String[] board = new String[]{"MME", "EEE", "EME"};
        int y = 0;
        int x = 0;

        String[] result = solution(board, y, x);
        System.out.println("result = " + Arrays.toString(result));

        assertThat(result).containsExactly("XME", "EEE", "EME");
    }

    private String[] solution(String[] board, int y, int x) {
        if (clickEqualsMine(board, y, x)) return gameOver(board, y, x);
        return hint(board, y, x);
    }

    private String[] hint(String[] board, int y, int x) {
        findMines(board, y, x);
        return board;
    }

    private void findMines(String[] board, int y, int x) {
        int result = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                System.out.println("i = " + i + "/ j = " + j + " / result = " + result);
                if (i == 0 && j == 0) break;



                if (y + i < 0 || y + i > board.length) break;
                if (x + j < 0 || x + j > board[y + i].split("").length) break;

                if (getValue(board[y + i], x + j).equals("M")) result++;
                else findMines(board, y + i, x + j);
            }
        }

        setValue(board[y], x, result == 0 ? "B" : String.valueOf(result));
    }


    private String[] gameOver(String[] board, int y, int x) {
        board[y] = setValue(board[y], x, "X");
        return board;
    }

    private boolean clickEqualsMine(String[] board, int y, int x) {
        return getValue(board[y], x).equals("M");
    }

    private String getValue(String row, int x) {
        return row.split("")[x];
    }

    private String setValue(String row, int x, String value) {
        return join(value, row.substring(0, x), row.substring(x+1));
    }
}
