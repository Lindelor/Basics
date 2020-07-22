package com.lind.epam.modul1.part.two;

public class ThirdTask {

    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 2;
        int x2 = 2;
        int y2 = 4;
        int x3 = 3;
        int y3 = 6;

        System.out.println(isOnRow(x1, y1, x2, y2, x3, y3));

    }

    public static boolean isOnRow(final int x1, final int y1, final int x2, final int y2,
                           final int x3, final int y3) {
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            return true;
        }
        return false;
    }

}
