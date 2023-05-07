package com.discphy.code.problem.baekjoon.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bronze1 {
    public void _1032() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine().trim());

        StringBuilder stringBuilder = new StringBuilder();
        List<char[]> list = new ArrayList<>();

        int length = 0;

        if (count == 1) { System.out.println(reader.readLine().trim()); return; }

        for (int a = 0; a < count; a++) {
            char[] chars = reader.readLine().trim().toCharArray();

            length = chars.length;
            list.add(chars);
        }

        for (int a = 0; a < length; a++) {
            char temp = ' ';
            for (char[] chars : list) {
                if (temp == ' ') { temp = chars[a]; continue; }
                if (temp != chars[a]) { temp = '?'; break; }
            }
            stringBuilder.append(temp);
        }

        System.out.println(stringBuilder);
    }

    public void _1037() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine().trim());
        String[] arr = reader.readLine().trim().split(" ");

        int max = 1, min = 1000001;

        if (count == 1) { System.out.println((int)Math.pow(Integer.parseInt(arr[0]), 2)); return; }

        for (int a = 0; a < count; a++) {
            min = Math.min(min, Integer.parseInt(arr[a]));
            max = Math.max(max, Integer.parseInt(arr[a]));
        }

        System.out.println(min * max);
    }
}
