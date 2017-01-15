package hw_02;

import java.util.Scanner;

/**
 * Created by ihor on 15.01.2017.
 * Вывод на экран вторую по величине переменную из 4 (значения всех переменных разные).
 */

public class hw_02_t5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp0, temp1, temp2, temp3, temp4;
        System.out.println("Enter 4 variables.");
        temp1 = scanner.nextInt();
        temp2 = scanner.nextInt();
        temp3 = scanner.nextInt();
        temp4 = scanner.nextInt();
        if (temp1 < temp2) {
            temp0 = temp2;
            temp2 = temp1;
            temp1 = temp0;
        }
        if (temp1 < temp3) {
            temp0 = temp3;
            temp3 = temp1;
            temp1 = temp0;
        }
        if (temp1 < temp4) {
            temp0 = temp4;
            temp4 = temp1;
            temp1 = temp0;
        }
        if (temp2 > temp3 & temp2 > temp4) {
            System.out.println(temp2);
        } else {
            if (temp3 > temp4) {
                System.out.println(temp3);
            } else {
                System.out.println(temp4);
            }
        }

        /*
        if (temp1 > temp2 & temp1 > temp3 & temp1 > temp4){
            if (temp2>temp3 & temp2>temp4) {
                System.out.println(temp2);
            } else {
                if (temp3 > temp4) {
                    System.out.println(temp3);
                }
                else {
                    System.out.println(temp4);
                }
            }
        }
        if (temp2 > temp1 & temp2 > temp3 & temp2 > temp4){
            if (temp1>temp3 & temp1>temp4) {
                System.out.println(temp1);
            } else {
                if (temp3 > temp4) {
                    System.out.println(temp3);
                }
                else {
                    System.out.println(temp4);
                }
            }
        }
        if (temp3 > temp2 & temp3 > temp1 & temp3 > temp4){
            if (temp2>temp1 & temp2>temp4) {
                System.out.println(temp2);
            } else {
                if (temp1 > temp4) {
                    System.out.println(temp1);
                }
                else {
                    System.out.println(temp4);
                }
            }
        }
        if (temp4 > temp2 & temp4 > temp3 & temp4 > temp1){
            if (temp2>temp3 & temp2>temp1) {
                System.out.println(temp2);
            } else {
                if (temp3 > temp1) {
                    System.out.println(temp3);
                }
                else {
                    System.out.println(temp1);
                }
            }
        } */
    }
}
