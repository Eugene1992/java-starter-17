package hw_02_t2;

import java.util.Scanner;

/**
 * Создать программу, проверяющую и сообщающую на экран, является ли введенное с
 консоли целое число, чётным либо нечётным.
 */
public class Hw02t2 {
    public static void main(String[] args) {
        System.out.println("Enter some digital: ");
        Scanner scan = new Scanner(System.in);
        int inputDigit = scan.nextInt();

        if ((inputDigit % 2)==0) {
            System.out.println(inputDigit + " - четное");
        }
        else{
                System.out.println(inputDigit + " - нечетное");
            }

        }

    }


