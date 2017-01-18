package hw_03;

import java.util.Scanner;

/**
 * Created by ihor on 16.01.2017.
 * Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
 */
public class Hw_03_t4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int n = scanner.nextInt(), factorial = 1;
        for (int i = 1; i < n + 1; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial= " + factorial);
    }
}
