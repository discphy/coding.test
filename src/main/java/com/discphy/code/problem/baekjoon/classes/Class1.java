package com.discphy.code.problem.baekjoon.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

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

    public void _2739() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        for (int a = 1; a <= 9; a++) {
            System.out.println(input + " * " + a + " = " + (input * a));
        }
    }

    public void _2920() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().trim().split(" ");

        boolean ascending = false, descending = false;
        int temp = 0;

        for (int a = 0; a < input.length; a++) {
            int value = Integer.parseInt(input[a]);

            if (temp == 0) { temp = value; continue; }

            if (value > temp) ascending = true;
            else descending = true;

            temp = value;
        }

        System.out.println(ascending && descending ? "mixed" : ascending ? "ascending" : "descending");
    }

    public void _8958() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(reader.readLine());

        for (int a = 0; a < testCount; a++) {
            char[] chars = reader.readLine().toCharArray();

            int score = 0, seq = 0;

            for (char ch : chars) {
                if (ch == 'O') score += ++seq;
                else seq = 0;
            }

            System.out.println(score);
        }
    }

    public void _10818() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(reader.readLine());
        String[] text = reader.readLine().split(" ");

        int min = 1000000, max = -1000000;

        for (int a = 0; a < testCount; a++) {
            int value = Integer.parseInt(text[a]);

            if (value > 1000000 || value < -1000000) continue;

            if (value >= max) max = value;
            if (value <= min) min = value;
        }

        System.out.println(min + " " + max);
    }

    public void _10950() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(reader.readLine());

        for (int a = 0; a < testCount; a++) {
            String[] text = reader.readLine().trim().split(" ");

            System.out.println(Integer.parseInt(text[0]) + Integer.parseInt(text[1]));
        }
    }

    public void _10951() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input = reader.readLine()) != null) {
            String[] array = input.split(" ");

            System.out.println(Integer.parseInt(array[0]) + Integer.parseInt(array[1]));
        }
    }

    public void _10952() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input = reader.readLine()) != null) {
            String[] array = input.split(" ");

            if (array[0].equals("0") && array[1].equals("0")) return;

            System.out.println(Integer.parseInt(array[0]) + Integer.parseInt(array[1]));
        }
    }

    public void _11654() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] input = reader.readLine().toCharArray();
        int value = input[0];

        System.out.println(value);
    }

    public void _11720() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        char[] input = reader.readLine().toCharArray();

        int sum = 0;

        for (int a = 0; a < count; a++) {
            sum += Integer.parseInt(String.valueOf(input[a]));
        }

        System.out.println(sum);
    }

    public void _2741() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        for (int a = 1; a <= input; a++) {
            System.out.println(a);
        }
    }

    public void _2742() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        for (int a = input; a >= 1; a--) {
            System.out.println(a);
        }
    }

    public void _2753() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        boolean leap = false;

        if (input % 4 == 0 && input % 100 != 0 || input % 400 == 0) leap = true;

        System.out.println(leap ? "1" : "0");
    }

    public void _2884() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(input[0]));
        calendar.set(Calendar.MINUTE, Integer.parseInt(input[1]));

        calendar.add(Calendar.MINUTE, -45);

        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + " " + calendar.get(Calendar.MINUTE));
    }

    public void _2908() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split(" ");

        int[] values = new int[2];

        for (int a = 0; a < inputs.length; a++) {
            char[] chars = inputs[a].toCharArray();
            StringBuffer buffer = new StringBuffer();

            for (int b = 2; b >= 0; b--) {
                buffer.append(chars[b]);
            }

            values[a] = Integer.parseInt(buffer.toString());
        }

        System.out.println(Math.max(values[0], values[1]));
    }

    public void _3052() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean[] booleans = new boolean[42];

        int sum = 0;

        for (int a = 0; a < 10; a++) booleans[Integer.parseInt(reader.readLine()) % 42] = true;

        for (boolean bool : booleans) if (bool) sum++;

        System.out.println(sum);
    }

    public void _9498() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        if (input >= 90) System.out.println("A");
        else if (input >= 80) System.out.println("B");
        else if (input >= 70) System.out.println("C");
        else if (input >= 60) System.out.println("D");
        else System.out.println("F");
    }

    public void _10809() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        StringBuffer buffer = new StringBuffer();

        for (char alphabet : alphabets) {
            buffer.append(buffer.toString().equals("") ? "" : " ").append(input.indexOf(alphabet));
        }

        System.out.println(buffer);
    }

    public void _10871() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().trim().split(" "), values = reader.readLine().trim().split(" ");

        int count = Integer.parseInt(input[0]), compare = Integer.parseInt(input[1]);
        StringBuffer buffer = new StringBuffer();

        for (int a = 0; a < count; a++) {
            int value = Integer.parseInt(values[a]);
            if (value < compare) buffer.append(buffer.toString().equals("") ? "" : " ").append(value);
        }

        System.out.println(buffer);
    }
}
