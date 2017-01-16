package hw_02_t7;

import java.util.Scanner;

/**
 * Используя IntelliJ IDEA, создайте класс Calculator.
 * Напишите программу - консольный калькулятор.
 * Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
 * Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
 * Выведите на экран результат выполнения арифметической операции.
 * В случае использования операции деления, организуйте проверку попытки деления на ноль.
 * И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
 * пользователя.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите два целыйх числа для совершения математического расчета!");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число №1:");
        int temp1 = scan.nextInt();

        System.out.print("Введите число №2:");
        int temp2 = scan.nextInt();
        System.out.print("Введите знак математической операции: +, -, * или /: ");

        String temp3 = scan.next();

        switch (temp3) {
            case "+":
                System.out.println(temp1 + temp2);
                break;
            case "-":
                System.out.println(temp1 - temp2);
                break;
            case "*":
                System.out.println(temp1 * temp2);
                break;
            case "/":
                if (temp2 != 0) {
                    System.out.println(temp1 / temp2);
                } else System.out.println("Деление на 0 запрещено )))");
                break;
            default:
                System.out.println("Что-то пошло не так )))");
        }
    }
}
