package com.discphy.code.problem.baekjoon.step;

import java.util.Scanner;

public class ArithmeticOperation {
    public void _1000() {
        int a, b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a + b);
    }

    public void _1001() {
        int a, b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a - b);
    }

    public void _1008() {
        double a, b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.println(a / b);
    }

    public void _10998() {
        int a, b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a * b);
    }

    public void _10869() {
        int a, b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    public void _10926() {
        String id;

        Scanner sc = new Scanner(System.in);
        id = sc.next();

        System.out.println(id + "??!");
    }

    public void _18108() {
        int year;

        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        System.out.println(year - 543);
    }

    public void _10430() {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }

    public void _2588() {
        int a, b, temp;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        temp = b;

        while(temp > 0) {
            System.out.println(a * (temp % 10));
            temp /= 10;
        }

        System.out.println(a * b);
    }
}
