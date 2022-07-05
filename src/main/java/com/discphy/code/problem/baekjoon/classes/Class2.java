package com.discphy.code.problem.baekjoon.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class2 {
    public void _1085() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().trim().split(" ");
        int x = Integer.parseInt(input[0]), y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]), h = Integer.parseInt(input[3]);

        int min = Math.min(x, y);

        min = Math.min(min, w - x);
        min = Math.min(min, h - y);

        System.out.println(min);
    }

    public void _4153() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input;

        while ((input = reader.readLine().trim().split(" ")).length > 0) {
            int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]), c = Integer.parseInt(input[2]);

            if (a == 0 && b == 0 && c == 0) break;

            String result = "wrong";
            a *= a; b *= b; c *= c;

            if (result.equals("wrong")) if (a + b == c) result = "right";
            if (result.equals("wrong")) if (a + c == b) result = "right";
            if (result.equals("wrong")) if (b + c == a) result = "right";

            System.out.println(result);
        }
    }

    public void _10250() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(reader.readLine());

        for (int a = 0; a < testCount; a++) {
            String[] input = reader.readLine().trim().split(" ");
            int h = Integer.parseInt(input[0]), w = Integer.parseInt(input[1]), person = Integer.parseInt(input[2]);

            String room = null;
            int count = 0;

            for (int b = 1; b <= w; b++) {
                for (int c = 1; c <= h; c++) if (++count == person) { room = String.valueOf(c); break; }
                if (room != null) { room = room + (b < 10 ? "0" + b : b); break; }
            }

            System.out.println(room);
        }
    }

    public void _2231() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(reader.readLine());

        int n = 0;

        while (++n < answer) {
            int sum = n, temp = n;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == answer) { break; }
        }

        System.out.println(n == answer ? 0 : n);
    }

    public void _2292() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(reader.readLine());

        int a = 1, start = 1, end = 1;
        int count = 1;

        while (answer > 1) {
            if (start < answer && answer <= end) break;

            start = start + (a - 1) * 6;
            end = end + (a * 6);

            count++;
            a++;
        }

        System.out.println(count);
    }

    public void _2798() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().trim().split(" ");
        String[] cards = reader.readLine().trim().split(" ");

        int count = Integer.parseInt(input[0]), target = Integer.parseInt(input[1]);
        int min = Integer.MAX_VALUE, result = 0;

        for (int a = 0; a < count - 2; a++) {
            for (int b = 1; b < count - 1; b++) {
                for (int c = 2; c < count; c++) {
                    if (a >= b || a >= c || b >= c) continue;

                    int card1 = Integer.parseInt(cards[a]), card2 = Integer.parseInt(cards[b]), card3 = Integer.parseInt(cards[c]);
                    int sum = card1 + card2 + card3, value;

                    if (sum > target) continue;

                    if ((value = Math.min(target - sum, min)) != min) {
                        result = sum;
                        min = value;
                    }
                }
            }
        }

        System.out.println(result);
    }

    public void _15829() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        char[] input = reader.readLine().trim().toCharArray();

        final int r = 31, m = 1234567891;
        long sum = 0;
        long square = 1;

        for (int a = 0; a < length; a++) {
            int alphabet = input[a] - 'a' + 1;

            sum += alphabet * square % m;
            square = square * 31 % m;
        }

        System.out.println(sum % m);
    }

    public void _1259() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!(input = reader.readLine()).equals("0")) {
            StringBuffer buffer = new StringBuffer();
            char[] chars = input.toCharArray();

            for (int a = chars.length; a > 0; a--) buffer.append(chars[a - 1]);

            System.out.println(buffer.toString().equals(input) ? "yes" : "no");
        }
    }

    public static void _2609() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().trim().split(" ");

        int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]);
        int result = a > b ? gcd(a, b) : gcd(b, a);

        System.out.println(result);
        System.out.println(a * b / result);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) return b;

        return gcd(b, a % b);
    }

    public void _2775() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(reader.readLine());

        for (int a = 0; a < testCase; a++) {
            int floor = Integer.parseInt(reader.readLine()) + 1;
            int ho = Integer.parseInt(reader.readLine()) + 1;

            int apt[][] = new int[floor][ho];

            for (int k = 0; k < floor; k++) {
                for (int n = 1; n < ho; n++) {
                    apt[k][n] = k != 0 ? apt[k - 1][n] + apt[k][n - 1] : n;
                }
            }

            System.out.println(apt[floor - 1][ho - 1]);
        }
    }

    public void _10989() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(reader.readLine());
        StringBuffer buffer = new StringBuffer();

        int[] arr = new int[100001];

        for (int a = 0; a < testCase; a++) arr[Integer.parseInt(reader.readLine())]++;

        for (int a = 0; a < arr.length; a++) {
            while (arr[a] > 0) {
                buffer.append(a + "\n");
                arr[a]--;
            }
        }

        System.out.println(buffer.toString());
    }

    public void _11050() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().trim().split(" ");

        int n = Integer.parseInt(input[0]), k = Integer.parseInt(input[1]);

        System.out.println(factorial(n) / (factorial(n - k)  * factorial(k)));
    }

    public static int factorial(int a) {
        if (a <= 1) return 1;

        return a * factorial(a - 1);
    }
}
