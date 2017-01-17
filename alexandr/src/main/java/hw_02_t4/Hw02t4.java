package hw_02_t4;

import java.util.Scanner;

/**
 * Задано три переменных, найти и вывести на экран переменную с максимальным значением
 * (значения всех переменных разные).
 */
public class Hw02t4 {
    public static void main(String[] args) {

        int digit1, digit2, digit3, temp1 = 0;
        Scanner scan = new Scanner(System.in);
        digit1 = scan.nextInt();
        digit2 = scan.nextInt();
        digit3 = scan.nextInt();
        if (digit1 > digit2) {
            if (digit1 > digit3) {
                temp1 = digit1;
            }
        } else if (digit2 > digit3) {
            temp1 = digit2;
        } else {
            temp1 = digit3;
        }

        System.out.println("Максимальное число = " + temp1);
    }
}
