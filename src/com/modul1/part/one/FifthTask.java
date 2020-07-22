package com.modul1.part.one;

//        Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
//        Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//        ННч ММмин SSc.

public class FifthTask {

    public static void main(String[] args) {

        int seconds = 10552;

        new FifthTask().clock(seconds);

    }

    public void clock(final int seconds) {
        int second;
        int minute;
        int hour;

        hour = (seconds - (seconds % 3600)) / 3600;
        minute = (seconds - (hour * 3600) - (seconds % 60)) / 60;
        second = (seconds - (hour * 3600) - (minute * 60));

        if (hour < 10) {
            System.out.print("0" + hour + ":");
        }
        else {
            System.out.print(hour + ":");
        }

        if (minute < 10) {
            System.out.print("0" + minute + ":");
        }
        else {
            System.out.print(minute + ":");
        }
        
        if (second < 10) {
            System.out.print("0" + second);
        }
        else {
            System.out.print(second);
        }

    }
}
