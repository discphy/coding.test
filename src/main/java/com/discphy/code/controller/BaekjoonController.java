package com.discphy.code.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@RestController
@RequestMapping("/baekjoon")
public class BaekjoonController {
    public static void main(String[] args) throws IOException {
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
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void _1037() throws IOException {
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
 */