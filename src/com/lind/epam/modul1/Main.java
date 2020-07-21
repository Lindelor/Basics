package com.lind.epam.modul1;

import java.util.Scanner;

public class Main {

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
        System.out.println("2nd task answer: \n" + SecondTask.secondMethod(a, b, c));
        System.out.println("3rd task answer: \n" + ThirdTask.thirdMethod(a, b));

    }
}
