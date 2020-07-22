package com.lind.part.two;

//    Вычислить значение функции
//    x^2-3x+9, если x<=3
//    1/(x^3 + 6), если x>3

import static java.lang.Math.pow;

public class FifthTask {

    public static void main(String[] args) {

        double x = 3;

        func(x);
    }

    public static void func(double x) {
        if (x <=3) {
            System.out.println("Answer is: ");
            System.out.println(pow(x, 2) - 3 * x + 9);
        }

        else {
            System.out.println("Answer is: ");
            System.out.println(1 / (pow(x, 3) + 6));
        }

    }

}
