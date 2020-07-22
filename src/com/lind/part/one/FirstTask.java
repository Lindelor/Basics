package com.lind.part.one;

//        z = ((a-3)*b/2)+c

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a;
        float b;
        float c;

        System.out.println("Input a: ");
        a = scanner.nextFloat();

        System.out.println("Input b: ");
        b = scanner.nextFloat();

        System.out.println("Input c: ");
        c = scanner.nextFloat();

        System.out.println("1st task answer: \n" + FirstTask.firstMethod(a, b, c));

    }

    public static float firstMethod(final float a, final float b, final float c) {
        return (float) (((a - 3.0) * b / 2.0) + c);
    }

}
