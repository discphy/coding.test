package com.discphy.code.problem.baekjoon.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class1 {
    public void _1152() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine().trim();

        System.out.println(!text.equals("") ? text.split("[ ]+").length : 0);
    }

    public void _1157() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = reader.readLine().toUpperCase().toCharArray();
        int[] alphabets = new int[26];

        int max = -1;
        char result = '?';

        for (char ch : chars) alphabets[ch - 'A']++;

        for (int a = 0; a < alphabets.length; a++) {
            if (alphabets[a] > max) { max = alphabets[a]; result = (char)(a + 'A'); continue; }
            if (alphabets[a] == max) result = '?';
        }

        System.out.println(result);
    }

    public void _1330() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("[ ]+");
        int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]);

        System.out.println(a == b ? "==" : (a > b ? ">" : "<"));
    }

    public void _1546() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double[] scores = new double[Integer.parseInt(reader.readLine())];
        String[] text = reader.readLine().split("[ ]+");

        double max = 0, sum = 0;

        for (int a = 0; a < text.length; a++) {
            scores[a] = Integer.parseInt(text[a]);
            if (scores[a] > max) max = scores[a];
        }

        for (double score : scores) {
            score = score / max * 100;
            sum = sum + score;
        }

        System.out.println(sum / scores.length);
    }

    public void _2437() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= input; i++) {
            String stars = "";
            for (int j = 1; j <= i; j++) stars += "*";
            System.out.println(stars);
        }
    }

    public void _2439() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= input; i++) {
            String stars = "";
            for (int j = 1; j <= input; j++) stars += input - j >= i ? " " : "*";
            System.out.println(stars);
        }
    }

    public void _2475() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] texts = reader.readLine().trim().split(" ");

        int sum = 0;

        for (String text : texts) {
            int input = Integer.parseInt(text);

            sum += input * input;
        }

        System.out.println(sum % 10);
    }

    public void _2562() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int max = 0, index = 0;

        for (int a = 1; a <= 9; a++) {
            int input = Integer.parseInt(reader.readLine());
            if (input > max) {
                max = input;
                index = a;
            }
        }

        System.out.println(max + "\n" + index);
    }

    public void _2577() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars;

        int result = 1;
        int[] numbers = new int[10];

        for (int a = 0; a < 3; a++) {
            result = result * Integer.parseInt(reader.readLine());
        }

        chars = String.valueOf(result).toCharArray();
        for (char ch : chars) numbers[Integer.parseInt(String.valueOf(ch))]++;

        for (int number : numbers) System.out.println(number);
    }

    public void _2675() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        for (int a = 0; a < count; a++) {
            String[] input = reader.readLine().split(" ");
            String print = "";

            int loop = Integer.parseInt(input[0]);
            char[] chars = input[1].toCharArray();

            for (char ch : chars) {
                for (int b = 0; b < loop; b++) print += ch;
            }

            System.out.println(print);
        }
    }
}
