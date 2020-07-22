package com.lind.part.three;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

import static java.lang.Math.pow;

public class FourthTask {

    public static void main(String[] args) {
        long result = multiPow();

        System.out.println("Result is: " + result);

    }

    public static long multiPow() {
        long result = 1;

        for (int i = 2; i <= 200; i++) {
            result *= pow(i, 2);
        }

        return result;
    }

}
