package com.discphy.code.programmers.woowa;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

public class TechCamp2023Real_3_Test {

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
        List<String[]> list = stream(board)
                .map(s -> s.split(""))
                .collect(toList());

        List<Box> boxes = new ArrayList<>();

        for (int a = 0; a < list.size(); a++) {
            boxes.addAll(getBoxes(a, list.get(a)));
        }

        System.out.println("boxes = " + boxes);

        return new String[0];
    }

    private List<Box> getBoxes(int y, String[] values) {
        List<Box> boxes = new ArrayList<>();

        for (int a = 0; a < values.length; a++) {
            boxes.add(new Box(y, a, values[a].equals("M")));
        }

        return boxes;
    }

    static public class Box {

        private final int y;
        private final int x;
        private final boolean mine;

        private String value;

        public Box(int y, int x, boolean mine) {
            this.y = y;
            this.x = x;
            this.mine = mine;
        }

        public Box click(int y, int x) {
            return this.y == y && this.x == x ? this : null;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "y=" + y +
                    ", x=" + x +
                    ", mine=" + mine +
                    ", value='" + value + '\'' +
                    '}';
        }
    }
}
