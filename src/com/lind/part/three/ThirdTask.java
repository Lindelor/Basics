package com.lind.part.three;

// Найти сумму квадратов первых ста чисел.

import static java.lang.Math.pow;

public class ThirdTask {

    public static void main(String[] args) {

        int result = sumPow();

        System.out.println("Result is: " + result);
    }

    public static int sumPow() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += pow(i, 2);
        }
        return result;
    }

}
