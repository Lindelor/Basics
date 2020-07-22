package com.lind.part.three;

// Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//        все числа от 1 до введенного пользователем числа.

import java.lang.reflect.Array;
import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {

        int a;

        a = input("a");

        if (a <= 0) {
            System.out.println("Invalid argument");
        }
        else {
            calculate(a);
        }

    }

    public static void calculate(int a) {
        int result = 0;
        for (int i = 1; i <= a; i++) {
            result += i;
        }

        System.out.println(result);

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
