package com.discphy.code.problem.programmers.exam;

import java.io.IOException;

public class Backend {
    public static void main(String[] args) throws IOException {
        //int[] grade = { 2, 1, 3 };
        //int[] grade = { 1, 2, 3 };
        int[] grade = { 3, 2, 3, 6, 4, 5 };

        int temp = 0, answer = 0;

        for (int a = grade.length; a > 0; a--) {
            int value = grade[a - 1];

            if (a == grade.length) { temp = value; continue; }

            if (value > temp) { answer += value - temp; }
            else temp = value;
        }

        System.out.println(answer);
    }
}
