package com.lind.part.one;

//        z = ((a-3)*b/2)+c

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {

        float a;
        float b;
        float c;

        a = input("a");
        b = input("b");
        c = input("c");

        System.out.println("1st task answer: \n" + FirstTask.firstMethod(a, b, c));

    }

    public static float firstMethod(final float a, final float b, final float c) {
        return (float) (((a - 3.0f) * b / 2.0f) + c);
    }

    public static float input(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input " + string + ":");

        while (!scanner.hasNextFloat()) {
            scanner.next();
            System.out.println("Input " + string + ":");
        }
        return scanner.nextFloat();

    }

}
