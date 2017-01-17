package hw_03;

import java.util.Scanner;

import static java.lang.Character.isDigit;

/**
 * Написать программу, которая реализует следующий функционал:
 * 6.1 Пользователь вводит число в 10-ой системе счисления.
 * 6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
 * в 2-ую
 * в 8-ую
 * в 16-ую
 * 6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
 * на экран результат.
 */
public class Hw03t3_ChangeDigitalSystem {
    public static void main(String[] args) {
        System.out.print("Я могу перевести любое число из 10-й системы исчисления в 2-ю, 8-ю, 16-ю. \n" +
                "Для этого введите любое просто число: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Теперь выберете систему исчисления, для этого введите 2, 8 или 16 соответственно: ");
        int choose = scan.nextInt();
        /*switch (choose){
            case 2:  System.out.println(Integer.toString(a, 2)); break;
            case 8: System.out.println(Integer.toString(a, 8)); break;
            case 16: System.out.println(Integer.toString(a, 16)); break;
            default: System.out.println("Я такого не предлагал, такой системы исчисления.");
            }*/

        if (choose == 2 || choose == 4 || choose == 16) {
            System.out.println(Integer.toString(a, choose));
        } else System.out.println("Я такого не предлагал, такой системы исчисления.");


    }

}