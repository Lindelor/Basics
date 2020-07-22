package com.lind.part.two;

//        Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
//        и если да, то будет ли он прямоугольным.

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        int a;
        int b;

        a = input("a");
        b = input("b");

        new FirstTask().isRightTriangle(a, b);

    }

    public void isRightTriangle(final int a, final int b) {
        if (a + b < 180 && a > 0 && b > 0) {
            System.out.println("Треугольник существует");

            if (b == 90 || a == 90 || a + b == 90) {
                System.out.println("Треугольник прямоугольный");
            }

            else {
                System.out.println("Треугольник не прямоугольный");
            }
        }

        else {
            System.out.println("Треугольник не существует");
        }
    }

    public static int input(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input " + string + ":");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Input " + string + ":");
        }
        return scanner.nextInt();

    }
}
