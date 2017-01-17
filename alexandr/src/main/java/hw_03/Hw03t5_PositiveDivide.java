package hw_03;

import java.util.Scanner;

/**
 * Выведите на экран все положительные делители натурального числа, введенного пользователем.
 */
public class Hw03t5_PositiveDivide {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для определения всех его положительных делителей: ");
        int usersDigital = scan.nextInt();
        for (int i = 1; i <= usersDigital; i++) {
            if (usersDigital % i == 0) {
                System.out.println(i);
            }
            // можно укоротить делением исходного числа на 2, но тогда не выведет число равное ему же )))
        }
    }
}
