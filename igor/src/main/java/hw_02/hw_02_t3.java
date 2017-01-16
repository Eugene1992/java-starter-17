package hw_02;

import java.util.Scanner;

/**
 * Created by ihor on 15.01.2017.
 * Программа, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
 */
public class hw_02_t3 {
    public static void main(String[] args) {
        final int TEN = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int number1 = scanner.nextInt();
        System.out.println("Enter the number 2");
        int number2 = scanner.nextInt();
        if (Math.abs(TEN - number1) == Math.abs(TEN - number2)) {
            System.out.println(number1 + " и " + number2 + " одинаково наближени к 10");
        } else {
            if (Math.abs(TEN - number1) < Math.abs(TEN - number2)) {
                System.out.println(number1 + " ближе к 10");
            } else {
                System.out.println(number2 + " ближе к 10");
            }
        }
    }
}