package com.lind.part.three;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//        заданному е. Общий член ряда имеет вид:
//        a(low n) = 1/(2^n) + 1/(3^n);

import java.util.Scanner;

import static java.lang.Math.pow;

public class FifthTask {

    public static void main(String[] args) {

        double e;
        e = input("e");
        double result = sum(e);

        System.out.println("Result is: " + result);
    }

    public static double sum(double e) {
        if (e <= 0) {
            System.out.println("e is so low");
            return 0;
        }
        double result = 0;
        int i = 1;
        while (e <= (1/pow(2,i) + 1/pow(3, i))) {
            result += 1/pow(2,i) + 1/pow(3, i);
            i++;
        }
        return result;
    }

    public static double input(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input " + name + ":");

        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Input " + name + ":");
        }
        return scanner.nextDouble();

    }
}
