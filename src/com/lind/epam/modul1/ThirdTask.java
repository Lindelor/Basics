package com.lind.epam.modul1;

import static java.lang.Math.*;

//        ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tg(xy)

public class ThirdTask {

    public static double thirdMethod(final double x, final double y) {
        if (cos(x) - sin(y) == 0) {

            System.out.println("Invalid argument\n");
            return 0;
        }
        return ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);
    }

}
