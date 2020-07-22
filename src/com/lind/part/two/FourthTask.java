package com.lind.part.two;

//    Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
//        Определить, пройдет ли кирпич через отверстие.

public class FourthTask {

    public static void main(String[] args) {

        int sizeA = 2;
        int sizeB = 3;
        int x = 2;
        int y = 4;
        int z = 1;

        System.out.println(new FourthTask().isSizeOk(sizeA, sizeB, x, y, z));

    }

    public boolean isSizeOk(int a, int b, int x, int y, int z) {

        if (a >= x && (b >= y || b >= z)) {
            return true;
        }

        else if (b >= x && (a >= y || a >= z)) {
            return true;
        }

        return false;
    }

}
