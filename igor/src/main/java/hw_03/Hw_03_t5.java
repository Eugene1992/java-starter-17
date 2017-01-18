package hw_03;

import java.util.Scanner;

/**
 * Created by ihor on 16.01.2017.
 * Выведите на экран все положительные делители натурального числа, введенного пользователем.
 */
public class Hw_03_t5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
