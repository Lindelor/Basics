package com.lind.part.three;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class SixthTask {

    public static void main(String[] args) {

        equal();

    }

    public static void equal() {

        char symb;
        for (int i = 97; i <=122; i++) {
            symb = (char)i;
            System.out.println("Symbol is: " + symb + ". In memory: " + i);
        }

    }

}
