package com.lind.part.one;

import java.util.Scanner;

//                Для данной области составить линейную программу, которая печатает true,
//                если точка с координатами (х, у)
//                принадлежит закрашенной области, и false — в противном случае:

public class SixthTask {

    public static void main(String[] args) {
        float x;
        float y;

        x = input("X");
        y = input("y");

        System.out.println(new SixthTask().isBelongs(x, y));

    }

    public boolean isBelongs(final float x, final float y) {
        if  (x <= 2 && x >= -2 && y <= 4 && y >= 0 ){
            return true;
        }

        if (x >= -4 && x <= 4 && y <=0 && y >= -3) {
            return true;
        }

        return false;
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
