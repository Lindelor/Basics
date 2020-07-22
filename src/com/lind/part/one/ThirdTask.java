package com.lind.part.one;

import java.util.Scanner;

import static java.lang.Math.*;

//        ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tg(xy)

public class ThirdTask {

    public static void main(String[] args) {


        double a;
        double b;

        a = input("a");
        b = input("b");

        System.out.println("3rd task answer: \n" + thirdMethod(a, b));

    }

    public static double thirdMethod(final double x, final double y) {
        if (cos(x) - sin(y) == 0) {
            System.out.println("Invalid argument\n");
            return 0;
        }

        return ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);
    }

    public static double input(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input " + string + ":");

        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Input " + string + ":");
        }
        return scanner.nextDouble();

    }
}
