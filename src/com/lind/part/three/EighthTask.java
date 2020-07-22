package com.lind.part.three;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class EighthTask {

    public static void main(String[] args) {

        float a = 297.43f;
        float b = 1234.567f;

        identicNum(a, b);

    }

    public static void identicNum(float a, float b) {

        System.out.println(a + " " + b);

        String numA = String.valueOf(a);
        String numB = String.valueOf(b);

        for (int i = 0; i < numA.length(); i++) {
            for (int j = 0; j < numB.length(); j++) {
                if (numA.charAt(i) == numB.charAt(j) && numA.charAt(i) != '.') {
                    System.out.println(numA.charAt(i));
                }
            }
        }

    }

}
