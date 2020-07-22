package com.lind.part.three;

// Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//        все числа от 1 до введенного пользователем числа.

import java.lang.reflect.Array;
import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {

        int a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a: ");
        a = scanner.nextInt();

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



}
