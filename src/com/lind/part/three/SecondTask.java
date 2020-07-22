package com.lind.part.three;

//Вычислить значения функции на отрезке [а,b] c шагом h:
//y = :   x, x>2
//        -x, x<=2
// т.к. флоат (как и дабл) имеют свойство терять точность - вывод отформатирован до 5 знаков после точки


public class SecondTask {

    public static void main(String[] args) {

        double a = 0;
        double b = 10;
        double h = 0.2;

        new SecondTask().func(a, b, h);

    }

    public void func(final double a, final double b, final double h) {
        for (double i = a; i <= b; i += h) {

            if (i <= 2) {
                System.out.format("y = %.5f %n", -i);
            }

            if (i > 2) {
                System.out.format("y = %.5f %n", i);
            }
        }
    }


}
