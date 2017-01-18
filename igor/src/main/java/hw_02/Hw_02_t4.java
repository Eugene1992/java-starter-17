package hw_02;

import java.util.Scanner;

/**
 * Created by ihor on 15.01.2017.
 * Опредиление максимальным значением одной из трох переменных (значения всех переменных разные).
 */
public class Hw_02_t4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number1, number2, number3");
        int temp1 = scanner.nextInt();
        int temp2 = scanner.nextInt();
        int temp3 = scanner.nextInt();
        if (temp1 > temp2 & temp1 > temp3) {
            System.out.println(temp1 + " maxi");
        } else {
            if (temp2 > temp3) {
                System.out.println(temp2 + " maxi");
            } else {
                System.out.println(temp3 + " maxi");
            }
        }
    }
}
