package com.discphy.code.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/baekjoon")
public class BaekjoonController {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(reader.readLine().trim());
        List<String> list = new ArrayList<>();


        for (int a = 0; a < testCount; a++) {
            String input = reader.readLine().trim();

            if (!list.contains(input)) list.add(input);
        }

        Collections.sort(list);

        list.sort(Comparator.comparingInt(String::length));

        for (String value : list) System.out.println(value);
    }
}
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(reader.readLine().trim());
        List<String> list = new ArrayList<>();


        for (int a = 0; a < testCount; a++) {
            String input = reader.readLine().trim();

            if (!list.contains(input)) list.add(input);
        }

        Collections.sort(list);

        list.sort(Comparator.comparingInt(String::length));

        for (String value : list) System.out.println(value);
    }
}
 */