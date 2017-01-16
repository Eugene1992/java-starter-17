package hw_03;

import java.util.Scanner;

/**
 * Created by ihor on 16.01.2017.
 * Написать программу, которая реализует следующий функционал:
    6.1 Пользователь вводит число в 10-ой системе счисления.
    6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
     в 2-ую
    в 8-ую
    в 16-ую
    6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
 на экран результат.
 */
public class Hw_03_t3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println("number system. (1 = 2, 2 = 8, 3 = 16)");
        int numberSystem = scanner.nextInt();
        int tempAnswer;
        switch (numberSystem){
            case 1:{
                for (int i = 31; i >= 0; i--) {
                    tempAnswer = (int) (number / Math.pow(2, i));
                    System.out.print(tempAnswer);
                    number = (int) (number - tempAnswer * Math.pow(2, i));
                    if (i % 4 == 0) {
                        System.out.print(" ");
                    }
                }
                break;
            }
            case 2:{
                for (int i = 11; i >= 0; i--) {
                    tempAnswer = (int) (number / Math.pow(8, i));
                    System.out.print(tempAnswer);
                    number = (int) (number - tempAnswer * Math.pow(8, i));
                    if (i % 4 == 0) {
                        System.out.print(" ");
                    }
                }
                break;
            }
            case 3:{
                for (int i = 7; i >= 0; i--) {
                    tempAnswer = (int) (number / Math.pow(16, i));
                    switch (tempAnswer) {
                        case 10: {
                            System.out.print("A");
                            break;
                        }
                        case 11: {
                            System.out.print("B");
                            break;
                        }
                        case 12: {
                            System.out.print("C");
                            break;
                        }
                        case 13: {
                            System.out.print("D");
                            break;
                        }
                        case 14: {
                            System.out.print("E");
                            break;
                        }
                        case 15: {
                            System.out.print("F");
                            break;
                        }
                        default:
                            System.out.print(tempAnswer);
                    }
                    number = (int) (number - tempAnswer * Math.pow(16, i));
                    if (i % 4 == 0) {
                        System.out.print(" ");
                    }
                }
                break;
            }
            default:
                System.out.println("oops");
        }
    }
}
