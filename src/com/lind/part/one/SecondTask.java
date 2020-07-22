package com.lind.part.one;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//        z = ((b+(b^2+4ac)^(1/2))/(2a))-a^3c+b^(-2)

public class SecondTask {

    public static void main(String[] args) {

        double a;
        double b;
        double c;

        a = input("a");
        b = input("b");
        c = input("c");

        System.out.println("2nd task answer: \n" + secondMethod(a, b, c));

    }

    public static double secondMethod(final double a, final double b, final double c) {
        if (a != 0 && b != 0) {
            return  (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow (b, -2);
        }

        System.out.println("Invalid argument\n");
        return 0;
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
