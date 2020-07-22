package com.modul1.part.two;

// Найти max{min(a, b), min(c, d)}.
//    в Java есть Math.max() и Math.min(), но тут вроде как ветвления проверяют, написал свой метод

import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        float a = 1;
        float b = 2;
        float c = 3;
        float d = 4;
        System.out.println("Ответ: " + max(min(a, b), min(c, d)));

    }

    public static float max(final float a, final float b) {
        if (a > b) return a;
        return b;
    }

    public static float min(final float a, final float b) {
        if (a > b) return b;
        return a;
    }

}
