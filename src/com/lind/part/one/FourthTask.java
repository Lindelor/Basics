package com.lind.part.one;

//        Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
//        Поменять местами дробную и целую части числа и вывести полученное значение числа.

import java.util.Scanner;

public class FourthTask {

    public static void main(String[] args) {

        float a;

        a = input("a");

        System.out.println("4th task answer: \n" + fourthTask(a));

    }

    public static float fourthTask(final float a) {

        String string = String.valueOf(a);
        string = string.substring(4) + "." + string.substring(0,3);
        return Float.parseFloat(string);

    }

    public static float input(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input " + name + ":");

        while (!scanner.hasNextFloat()) {
            scanner.next();
            System.out.println("Input " + name + ":");
        }
        return scanner.nextFloat();

    }

}
