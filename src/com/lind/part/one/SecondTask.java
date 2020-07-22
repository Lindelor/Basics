package com.lind.part.one;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//        z = ((b+(b^2+4ac)^(1/2))/(2a))-a^3c+b^(-2)

public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.println("Input a: ");
        a = scanner.nextFloat();

        System.out.println("Input b: ");
        b = scanner.nextFloat();

        System.out.println("Input c: ");
        c = scanner.nextFloat();

        System.out.println("2nd task answer: \n" + secondMethod(a, b, c));

    }

    public static double secondMethod(final double a, final double b, final double c) {
        if (a != 0 && b != 0) {
            return  (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow (b, -2);
        }

        System.out.println("Invalid argument\n");
        return 0;
    }



}
