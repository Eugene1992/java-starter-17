package hw_03;

import java.util.Scanner;

/**
 * Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
 */
public class Hw03t4_Factorrrrial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int fac = scan.nextInt();
        int temp = 1;
        for (int i = 1; i < fac + 1; i++) {
            temp *= i;
        }
        System.out.println(temp);

    }
}
