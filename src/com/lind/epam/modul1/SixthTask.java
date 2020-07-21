package com.lind.epam.modul1;

import java.util.Scanner;

public class SixthTask {

    public static void main(String[] args) {
        float x;
        float y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        x = scanner.nextFloat();
        System.out.println("Input y: ");
        y = scanner.nextFloat();
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
}
