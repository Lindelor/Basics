package com.lind.part.three;

//Для каждого натурального числа в промежутке от m до n вывести все делители,
//        кроме единицы и самого числа. m и n вводятся с клавиатуры.

import java.util.Scanner;

public class SeventhTask {

    public static void main(String[] args) {

        int m = input("m");
        int n = input("n");

        numDividers(goodNum(m), goodNum(n));


    }

    public static void numDividers(int m, int n) {

        for (int i = m; i <= n; i++) {
            System.out.println("\nDividers for " + i + " is: ");

            for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }

    public static int goodNum(int num) {

        if (num <= 0) {
            return 0;
        }

        return num;
    }

    public static int input(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input " + name + ":");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Input " + name + ":");
        }
        return scanner.nextInt();

    }

}
