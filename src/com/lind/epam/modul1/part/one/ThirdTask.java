package com.lind.epam.modul1.part.one;

import java.util.Scanner;

import static java.lang.Math.*;

//        ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tg(xy)

public class ThirdTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float a;
        float b;

        System.out.println("Input a: ");
        a = scanner.nextFloat();
        System.out.println("Input b: ");
        b = scanner.nextFloat();
        System.out.println("3rd task answer: \n" + thirdMethod(a, b));

    }

    public static double thirdMethod(final double x, final double y) {
        if (cos(x) - sin(y) == 0) {

            System.out.println("Invalid argument\n");
            return 0;
        }
        return ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);
    }

}
