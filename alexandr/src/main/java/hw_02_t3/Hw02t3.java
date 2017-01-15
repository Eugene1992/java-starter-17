package hw_02_t3;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.util.Scanner;

/**
 * Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
 Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
 */
public class Hw02t3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число из 1 пары: ");
        int firstNumber1 = scan.nextInt();
        System.out.print("Введите врторое число из 1 пары: ");
        int firstNumber2 = scan.nextInt();
        System.out.print("Введите первое число из 2 пары: ");
        int secondNumber1 = scan.nextInt();
        System.out.print("Введите второе число из 2 пары: ");
        int secondNumber2 = scan.nextInt();

        int tenNumber = 10;

        int temp1, temp2, temp3;
        temp1 = Math.abs(tenNumber - firstNumber1);
        temp2 = Math.abs(tenNumber - firstNumber2);
        temp1 = temp1 < temp2 ? temp1 : temp2;
        temp2 = Math.abs(tenNumber - secondNumber1);
        temp3 = Math.abs(tenNumber - secondNumber2);
        temp2 = temp2 < temp3 ? temp2 : temp3;

        if (temp1 < temp2) {
            System.out.printf("Ближе первый набор: $d, $d", firstNumber1, firstNumber2);
        }
        else if (temp1 > temp2) {
            System.out.printf("Ближе второй набор: %d, %d", secondNumber1, secondNumber2);
        } else System.out.println("Обе пары одинаково приближены к главному числу");




    }
}
