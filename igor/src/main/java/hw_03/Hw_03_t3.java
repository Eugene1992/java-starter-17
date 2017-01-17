package hw_03;

import java.util.Scanner;

/**
 * Created by ihor on 16.01.2017.
 * Написать программу, которая реализует следующий функционал:
 * 6.1 Пользователь вводит число в 10-ой системе счисления.
 * 6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
 * в 2-ую
 * в 8-ую
 * в 16-ую
 * 6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
 * на экран результат.
 */
public class Hw_03_t3 {
    public static String reverseWithXOR(String string) {
        char[] array = string.toCharArray();
        int length = array.length;
        int half = (int) Math.floor(array.length / 2);
        for (int i = 0; i < half; i++) {
            array[i] ^= array[length - i - 1];
            array[length - i - 1] ^= array[i];
            array[i] ^= array[length - i - 1];
        }
        return String.valueOf(array);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println("number system. (2, 8 or 16)");
        int numberSystem = scanner.nextInt();
        int flag = 0;
        String str = "";
        if (number > 0) {
            while (number > 0) {
                switch (number % numberSystem) {
                    case 10: {
                        str += "A";
                        break;
                    }
                    case 11: {
                        str += "B";
                        break;
                    }
                    case 12: {
                        str += "C";
                        break;
                    }
                    case 13: {
                        str += "D";
                        break;
                    }
                    case 14: {
                        str += "E";
                        break;
                    }
                    case 15: {
                        str += "F";
                        break;
                    }
                    default:
                        str += number % numberSystem;
                }
                number = number >> (byte) (Math.log(numberSystem) / Math.log(2));
                flag ++;
                if (flag >= 4){
                    flag = 0;
                    str += " ";
                }
            }
        }
        for (int i = flag; i < 4; i++) {
            str += "0";
        }
        System.out.println(reverseWithXOR(str));
    }
}
