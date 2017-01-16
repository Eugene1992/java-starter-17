package hw_02;

import java.util.Scanner;

/**
 * Created by ihor on 15.01.2017.
 * Проверяет и сообщает на экран, является ли введенное с консоли целое число, чётным либо нечётным.
 */

public class hw_02_t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for parity");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + ", an even");
        } else {
            System.out.println(number + ", do not even");
        }
    }
}
